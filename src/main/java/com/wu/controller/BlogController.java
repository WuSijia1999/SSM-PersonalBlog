package com.wu.controller;

import com.wu.entity.Blog;
import com.wu.service.BlogService;
import com.wu.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    //@RequestMapping("/writeBlog")和不加斜杆@RequestMapping("writeBlog")都可
    @RequestMapping("writeBlog")
    public String writeBlog(Blog blog){
        //获取当前日期
        Date currentTime = new Date();
        //将日期转化为指定格式
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        Date date=DateUtil.StringToDate(dateString,"yyyy-MM-dd HH:mm:ss");
        blog.setTime(date);
        this.blogService.writeBlog(blog);
        return "success";
    }

    //首页显示全部博客
    //参数一般是Model model，用HttpServletRequest也可
    @RequestMapping("selectAllBlog")
    public String selectAllBlog(HttpServletRequest request) {
        try {
            List<Blog> blogs;
            blogs = this.blogService.selectAllBlog();
            //将查询结果的list放入request返回给页面，页面用JSTL表达式获取显示
            request.setAttribute("blogs", blogs);
            return "index";
        } catch (Exception e) {
            System.out.println(e);
            return "index";
        }
    }

    //转到管理页面（还是要显示全部博客，其中有写博客，写日记，删除博客，删除日记的标签）
    @RequestMapping("selectAllBlog2")
    public String selectAllBlog2(HttpServletRequest request) {
        try {
            List<Blog> blogs;
            blogs = this.blogService.selectAllBlog();
            request.setAttribute("blogs", blogs);
            return "admin";
        } catch (Exception e) {
            System.out.println(e);
            return "admin";
        }
    }

    //查看单个博客的全部内容（阅读全文）
    @RequestMapping("selectBlogById")
    public String selectBlogById(HttpServletRequest request) {
        try {
            //获取id并转化类型
            String id = request.getParameter("blogid");
            int blogid = Integer.parseInt(id);
            List<Blog> blogs = this.blogService.selectBlogById(blogid);
            //将查询结果返回
            request.setAttribute("blog", blogs.get(0));
            return "blog";
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //跳转到删除博客的页面
    @RequestMapping("adminblog")
    public String adminblog(HttpServletRequest request) {
        try {
            List<Blog> blogs;
            blogs = this.blogService.selectAllBlog();
            request.setAttribute("blogs", blogs);
            return "adminblog";
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //删除博客
    @RequestMapping("deleteBlogById")
    public String deleteBlogById(HttpServletRequest request) {
        try {
            String id = request.getParameter("blogid");
            int blogid = Integer.parseInt(id);
            //调用删除
            this.blogService.deleteBlogById(blogid);
            return "redirect:adminblog";
        } catch (Exception e) {
            return null;
        }
    }

}

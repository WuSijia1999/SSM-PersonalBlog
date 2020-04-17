package com.wu.service.impl;

import com.wu.dao.BlogMapper;
import com.wu.entity.Blog;
import com.wu.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    public void writeBlog(Blog blog) {
        blogMapper.writeBlog(blog);
    }

    public List<Blog> selectAllBlog() {
        return blogMapper.selectAllBlog();
    }

    public List<Blog> selectBlogById(int id) {
        return blogMapper.selectBlogById(id);
    }

    public void deleteBlogById(int id) {
        blogMapper.deleteBlogById(id);
    }
}

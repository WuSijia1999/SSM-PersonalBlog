package com.wu.dao;

import com.wu.entity.Blog;

import java.util.List;

public interface BlogMapper {
    void writeBlog(Blog blog);
    List<Blog> selectAllBlog();
    List<Blog> selectBlogById(int id);
    void deleteBlogById(int id);
}

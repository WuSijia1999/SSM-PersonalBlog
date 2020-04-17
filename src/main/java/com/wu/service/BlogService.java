package com.wu.service;

import com.wu.entity.Blog;

import java.util.List;

public interface BlogService {
    void writeBlog(Blog blog);

    List<Blog> selectAllBlog();

    List<Blog> selectBlogById(int id);

    void deleteBlogById(int id);
}

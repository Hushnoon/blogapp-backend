package com.niit.blogapp.backend.dao;

import java.util.List;

import com.niit.blogapp.backend.model.Blog;

public interface BlogDAO {

	public List<Blog> getAllBlogs();
	public void addBlog(Blog b);
	public void updateBlog(Blog b);
	public void deleteBlog(Blog b);
	public Blog getBlogById(int blogId);
	
}

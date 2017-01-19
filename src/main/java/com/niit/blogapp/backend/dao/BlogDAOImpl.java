package com.niit.blogapp.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.blogapp.backend.model.Blog;

@Repository
@EnableTransactionManagement
@Transactional
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	SessionFactory  sessionFactory;
	
	public List<Blog> getAllBlogs() {
		System.out.println("start:ALL");
		Session session=sessionFactory.getCurrentSession();
		List<Blog> blogs=session.createQuery("from Blog").getResultList();
		System.out.println("End:ALL");
		return blogs;
	}

	public void addBlog(Blog b) {
		System.out.println("start:add");
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(b);
		System.out.println("end:add");
	}

	public void updateBlog(Blog b) {
		System.out.println("start:update");
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(b);
		System.out.println("end:update");
	}

	public void deleteBlog(Blog b) {
		System.out.println("start:delete");
		Session session=sessionFactory.getCurrentSession();
		session.delete(b);
		System.out.println("end:delete");
	}

	public Blog getBlogById(int blogId) {
		System.out.println("start:getbyid");
		Session session=sessionFactory.getCurrentSession();
		Blog b=(Blog)session.createQuery("from Blog where blogId="+blogId).getSingleResult();
		System.out.println("end:getbyid");
		return b;
	}

}

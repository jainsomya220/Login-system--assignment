package com.login.springdemo.dao;





import java.util.List;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.login.springdemo.controller.loginspring;
import com.login.springdemo.entity.User;


@Repository
public class UserDaoimpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getuser(loginspring log) {
		// TODO Auto-generated method stub
        Session currentSession=sessionFactory.getCurrentSession();
		
		Query<User>theQuery;
		theQuery=currentSession.createQuery("from User where email=:usernameparam and password=:userpasswordparam", User.class);
		theQuery.setParameter("usernameparam",log.getEmail());  //use query parameters
		theQuery.setParameter("userpasswordparam", log.getPassword());
	    List<User>user=theQuery.getResultList();
	   
	    if(user.size()>0)
	    { 
	    	return user.get(0);
	    }
	    else
	    {
	    	return null;
	    }                   
		
	}

	
	//need to inject the session factory
	
	 //from User u where"+" u.email="+userName+"and" +" u.password="+password

}

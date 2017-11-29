package com.commons.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commons.Bean.User;

@Repository
public class loginchcekdao implements logincheck{

	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public User findByUsername(String uname) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();

            String hql = "FROM User WHERE username in :username";
		List<User> userlist=session.createQuery(hql).setParameter("username", uname).list();
		System.out.println("sdaasdasdadasd");
		if(!userlist.isEmpty()){
			return userlist.get(0);
		}else{
			return null;
		}
		
		
		
	}

}

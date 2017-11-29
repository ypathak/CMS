package com.commons.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commons.Bean.User;

@Repository
public class registerdaoimp implements registerdao {

	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public void sasveuserdao(User user) {
		// TODO Auto-generated method stub
	          Session session=sessionfactory.getCurrentSession();
	          Transaction transaction=session.beginTransaction();
	          session.save(user);
	          transaction.commit();
	          session.close();
	}

	
}

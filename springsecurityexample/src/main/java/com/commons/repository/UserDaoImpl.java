package com.commons.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commons.entity.User;

@Repository
public class UserDaoImpl extends GenericDAOImpl<User, Long> implements UserDao  {
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public User findByUserName(String userName) throws Exception{
		Session session = sessionfactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		User user = null;
		try {
			String hql = "FROM User WHERE username = :username or email = :username";
			user = (User) session.createQuery(hql)
					.setParameter("username", userName).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			transaction.commit();
			session.close();
		}
		return user;
	}
}

package com.commons.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.commons.entity.User;

@Repository
public class UserDaoImpl extends GenericDAOImpl<User, Long> implements UserDao  {
	
	@Override
	public Class<User> getType() {
		return User.class;
	}
	
	@Override
	public User findByUserName(String userName) throws Exception{
		Session session = getSession();
		beginTransaction();
		User user = null;
		try {
			String hql = "FROM User WHERE username = :username or email = :username";
			user = (User) session.createQuery(hql)
					.setParameter("username", userName).uniqueResult();
			
			findAll();
		} catch (Exception e) {
			e.printStackTrace();
			rollback();
			throw e;
		} finally {
			commitTransaction();
			closeSession();
		}
		return user;
	}
}

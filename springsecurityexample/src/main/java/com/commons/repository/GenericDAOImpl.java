package com.commons.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericDAOImpl<T, PK extends Serializable> implements	GenericDAO<T, PK> {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	void beginTransaction() {
		getSession().getTransaction().begin();
	}

	void commitTransaction() {
		getSession().getTransaction().commit();
	}

	void closeSession() {
		getSession().close();
	}

	void rollback() {
		getSession().getTransaction().rollback();
	}

	@Override
	public T findOne(PK pk) {
		return (T) getSession().get(getType(), pk);
	}

	@Override
	public List<T> findAll() {
		return getSession().createQuery("FROM " + getType().getName()).list();
	}

	@Override
	public Long count() {
		return (Long) getSession().createQuery("select count(*) from " + getType().getName() + " o").list().get(0);
	}

	@Override
	public T save(T t) {
		getSession().saveOrUpdate(t);
		return t;
	}

	@Override
	public void merge(T t) {
		getSession().merge(t);
	}

	@Override
	public void delete(T t) {
		getSession().delete(t);
	}

	@Override
	public void delete(PK pk) {
		getSession().createQuery("delete from " + getType().getName() + " where id = " + pk).executeUpdate();
	}
}

package com.commons.repository;

import java.io.Serializable;
import java.util.List;


public interface GenericDAO<T, PK extends Serializable> {

	T save(T t);

	void merge(T t);

	void delete(T t);

	void delete(PK pk);

	T findOne(PK pk);

	List<T>findAll();

	Long count();

	Class<T>getType();

}

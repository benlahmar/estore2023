package com.example.demo.repos;

import java.util.List;

public interface IDao<T, K> {

	public T add(T t);
	public T findById(K k);
	public List<T> findAll();
	public void delete(T t);
}

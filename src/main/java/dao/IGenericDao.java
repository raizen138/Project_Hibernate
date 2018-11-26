package main.java.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T, ID extends Serializable> {
	void saveOrUpdate(T entity);

	T get(ID id);

	void delete(ID id);

	List<T> list();
}

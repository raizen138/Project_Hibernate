package main.java.dao;

import java.util.List;

import main.java.tastat.Proveidor;

public interface IProveidorDao extends IGenericDao<Proveidor,Integer>{

	void saveOrUpdate(Proveidor p);

	Proveidor get(Integer id);

	List<Proveidor> list();

	void delete(Integer id);
	
	
	
}

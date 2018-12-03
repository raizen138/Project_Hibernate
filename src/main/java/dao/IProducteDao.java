package main.java.dao;

import java.util.List;

import main.java.tastat.Producte;

public interface IProducteDao extends IGenericDao<Producte,Integer>{

	void saveOrUpdate(Producte p);

	Producte get(Integer id);

	List<Producte> list();

	void delete(Integer id);
	
	
}
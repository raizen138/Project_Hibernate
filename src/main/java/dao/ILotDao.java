package main.java.dao;

import java.util.List;

import main.java.tastat.Lot;
import main.java.tastat.Producte;


public interface ILotDao extends IGenericDao<Lot,Integer>{

	void saveOrUpdate(Lot p);

	Lot get(Integer id);

	List<Lot> list();

	void delete(Integer id);
	
	boolean setProducte(Lot l, Producte p);
	
	
}

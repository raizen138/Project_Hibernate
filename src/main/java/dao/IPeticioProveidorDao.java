package main.java.dao;


import java.util.List;

import main.java.tastat.PeticioProveidor;
import main.java.tastat.Producte;
import main.java.tastat.Proveidor;

public interface IPeticioProveidorDao extends IGenericDao<PeticioProveidor, Integer>{

	void saveOrUpdate(PeticioProveidor a);

	PeticioProveidor get(Integer id);

	List<PeticioProveidor> list();

	void delete(Integer id);
	
	boolean setProveidor(PeticioProveidor pp, Proveidor p);
	
	boolean setProducte(PeticioProveidor pp, Producte p);
	
}

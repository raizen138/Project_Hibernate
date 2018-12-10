package main.java.dao;

import java.util.List;

import main.java.tastat.Comanda;
import main.java.tastat.Lot;
import main.java.tastat.PeticioProveidor;
import main.java.tastat.Producte;

public interface IProducteDao extends IGenericDao<Producte,Integer>{

	void saveOrUpdate(Producte p);

	Producte get(Integer id);

	List<Producte> list();

	void delete(Integer id);
	
	boolean setLot(Producte p, Lot l);
	
	boolean setIngredient(Producte p, Producte p2);
	
	boolean setPeticio(Producte p, PeticioProveidor pp);
	
	boolean setComanda(Producte p, Comanda c);
}

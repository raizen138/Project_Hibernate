package main.java.dao;

import java.util.List;

import main.java.tastat.Client;
import main.java.tastat.Comanda;
import main.java.tastat.Producte;

public interface IComandaDao extends IGenericDao<Comanda,Integer>{

	void saveOrUpdate(Comanda p);

	Comanda get(Integer id);

	List<Comanda> list();

	void delete(Integer id);
	
	boolean setProducte(Comanda c, Producte p);
	
	boolean setClient(Comanda c, Client cl);
	
}

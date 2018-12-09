package main.java.dao;

import java.util.List;

import main.java.tastat.Address;
import main.java.tastat.Client;
import main.java.tastat.Comanda;


public interface IClientDao extends IGenericDao<Client,Integer>{

	void saveOrUpdate(Client p);

	Client get(Integer id);

	List<Client> list();

	void delete(Integer id);
	
	boolean setComanda(Client c, Comanda co);
	
	boolean setAddress(Client c, Address a);
	
	
}

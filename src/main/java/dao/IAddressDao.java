package main.java.dao;

import java.util.List;

import main.java.tastat.Address;
import main.java.tastat.Client;
import main.java.tastat.Proveidor;


public interface IAddressDao extends IGenericDao<Address, Integer>{

	void saveOrUpdate(Address a);

	Address get(Integer id);

	List<Address> list();

	void delete(Integer id);
	
	boolean setProveidor(Address a, Proveidor p);
	
	boolean setClient(Address a, Client c);

}

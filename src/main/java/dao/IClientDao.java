package main.java.dao;

import java.util.List;

import main.java.tastat.Client;


public interface IClientDao extends IGenericDao<Client,Integer>{

	void saveOrUpdate(Client p);

	Client get(Integer id);

	List<Client> list();

	void delete(Integer id);
	
	
	
}
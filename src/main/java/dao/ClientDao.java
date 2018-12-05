package main.java.dao;

import java.util.List;

import main.java.tastat.Client;

public class ClientDao extends GenericDao<Client,Integer> implements IClientDao{

	@Override
	public void saveOrUpdate(Client entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public Client get(Integer id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public List<Client> list() {
		// TODO Auto-generated method stub
		return super.list();
	}

	
	
	
}

package main.java.dao;

import java.util.List;

import main.java.tastat.Proveidor;

public class ProveidorDao extends GenericDao<Proveidor,Integer> implements IProveidorDao{

	@Override
	public void saveOrUpdate(Proveidor entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public Proveidor get(Integer id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public List<Proveidor> list() {
		// TODO Auto-generated method stub
		return super.list();
	}

}

package main.java.dao;

import java.util.List;

import main.java.tastat.Producte;

public class ProducteDao extends GenericDao<Producte,Integer> implements IProducteDao{

	@Override
	public void saveOrUpdate(Producte entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public Producte get(Integer id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public List<Producte> list() {
		// TODO Auto-generated method stub
		return super.list();
	}

}

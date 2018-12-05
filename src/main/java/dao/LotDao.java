package main.java.dao;

import java.util.List;

import main.java.tastat.Lot;

public class LotDao extends GenericDao<Lot,Integer> implements ILotDao{

	@Override
	public void saveOrUpdate(Lot entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public Lot get(Integer id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public List<Lot> list() {
		// TODO Auto-generated method stub
		return super.list();
	}

}

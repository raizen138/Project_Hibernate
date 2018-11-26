package main.java.dao;

import java.util.List;

import main.java.tastat.LotDesglossat;

public interface ILotDao extends IGenericDao<LotDesglossat,Integer>{

	void saveOrUpdate(LotDesglossat p);

	LotDesglossat get(Integer id);

	List<LotDesglossat> list();

	void delete(Integer id);
	
	
}

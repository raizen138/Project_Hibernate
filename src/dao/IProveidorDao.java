package dao;

import java.util.List;


import tastat.Proveidor;

public interface IProveidorDao extends IGenericDao<Proveidor,Integer>{

	void saveOrUpdate(Proveidor p);

	Proveidor get(Integer id);

	List<Proveidor> list();

	void delete(Integer id);
	
	
	
}

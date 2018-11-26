package dao;

import java.util.List;

import conrelaciones.Modulo;
import conrelaciones.Profesor;

public interface IModuloDao extends IGenericDao<Modulo,Integer>{

	void saveOrUpdate(Modulo m);

	Modulo get(Integer id);

	List<Modulo> list();

	void delete(Integer id);

}

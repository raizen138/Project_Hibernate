package dao;

import java.util.List;

import conrelaciones.Modulo;
import conrelaciones.Profesor;

public interface IProfesorDao extends IGenericDao<Profesor,Integer>{

	void saveOrUpdate(Profesor p);

	Profesor get(Integer id);

	List<Profesor> list();

	void delete(Integer id);
	
	boolean afegirModul(Profesor p, Modulo m);

}

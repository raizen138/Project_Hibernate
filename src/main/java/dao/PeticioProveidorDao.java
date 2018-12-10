package main.java.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.java.tastat.PeticioProveidor;
import main.java.tastat.Producte;
import main.java.tastat.Proveidor;

public class PeticioProveidorDao extends GenericDao<PeticioProveidor, Integer> implements IPeticioProveidorDao{

	@Override
	public boolean setProveidor(PeticioProveidor pp, Proveidor p) {
		Session session = sessionFactory.getCurrentSession();
		pp.setProveidor(p);
		p.getPeticionsProvedor().add(pp);
		try {
			session.beginTransaction();
			session.saveOrUpdate(pp);
			session.saveOrUpdate(p);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null && session.getTransaction() != null) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				session.getTransaction().rollback();
			}
			return false;
		}
	}

	@Override
	public boolean setProducte(PeticioProveidor pp, Producte p) {
		Session session = sessionFactory.getCurrentSession();
		pp.setProducte(p);
		p.getPeticioProveidor().add(pp);
		try {
			session.beginTransaction();
			session.saveOrUpdate(pp);
			session.saveOrUpdate(p);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null && session.getTransaction() != null) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				session.getTransaction().rollback();
			}
			return false;
		}
	}

}

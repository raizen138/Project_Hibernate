package main.java.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.java.tastat.Address;
import main.java.tastat.PeticioProveidor;
import main.java.tastat.Proveidor;

public class ProveidorDao extends GenericDao<Proveidor,Integer> implements IProveidorDao{

	@Override
	public boolean setAddress(Proveidor p, Address a) {
		Session session = sessionFactory.getCurrentSession();
		p.setAddress(a);
		a.setProveidor(p);
		try {
			session.beginTransaction();
			session.saveOrUpdate(a);
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
	public boolean setPeticio(Proveidor p, PeticioProveidor pp) {
		Session session = sessionFactory.getCurrentSession();
		p.getPeticionsProvedor().add(pp);
		pp.setProveidor(p);
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

package main.java.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.java.tastat.Address;
import main.java.tastat.Client;
import main.java.tastat.Proveidor;

public class AddressDao extends GenericDao<Address, Integer> implements IAddressDao{

	@Override
	public boolean setProveidor(Address a, Proveidor p) {
		Session session = sessionFactory.getCurrentSession();
		a.setProveidor(p);
		p.setAddress(a);
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
	public boolean setClient(Address a, Client c) {
		Session session = sessionFactory.getCurrentSession();
		a.setClient(c);
		c.setAdreca(a);
		try {
			session.beginTransaction();
			session.saveOrUpdate(a);
			session.saveOrUpdate(c);
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

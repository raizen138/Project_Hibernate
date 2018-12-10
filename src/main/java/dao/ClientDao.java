package main.java.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.java.tastat.Address;
import main.java.tastat.Client;
import main.java.tastat.Comanda;

public class ClientDao extends GenericDao<Client,Integer> implements IClientDao{


	@Override
	public boolean setComanda(Client c, Comanda co) {
		Session session = sessionFactory.getCurrentSession();
		c.getComandes().add(co);
		co.setComprador(c);
		try {
			session.beginTransaction();
			session.saveOrUpdate(c);
			session.saveOrUpdate(co);
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
	public boolean setAddress(Client c, Address a) {
		Session session = sessionFactory.getCurrentSession();
		c.setAdreca(a);
		a.setClient(c);
		try {
			session.beginTransaction();
			session.saveOrUpdate(c);
			session.saveOrUpdate(a);
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

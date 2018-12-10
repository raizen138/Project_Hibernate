package main.java.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.java.tastat.Client;
import main.java.tastat.Comanda;
import main.java.tastat.Producte;

public class ComandaDao extends GenericDao<Comanda, Integer> implements IComandaDao{

	@Override
	public boolean setProducte(Comanda c, Producte p) {
		Session session = sessionFactory.getCurrentSession();
		c.getComandes().add(p);
		p.getProducteComanda().add(p);
		try {
			session.beginTransaction();
			session.saveOrUpdate(c);
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
	public boolean setClient(Comanda c, Client cl) {
		Session session = sessionFactory.getCurrentSession();
		c.setComprador(cl);
		cl.getComandes().add(c);
		try {
			session.beginTransaction();
			session.saveOrUpdate(c);
			session.saveOrUpdate(cl);
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

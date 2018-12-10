package main.java.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import main.java.tastat.Comanda;
import main.java.tastat.Lot;
import main.java.tastat.PeticioProveidor;
import main.java.tastat.Producte;

public class ProducteDao extends GenericDao<Producte,Integer> implements IProducteDao{


	@Override
	public boolean setLot(Producte p, Lot l) {
		Session session = sessionFactory.getCurrentSession();
		p.getLotes().add(l);
		l.setProducte(p);
		try {
			session.beginTransaction();
			session.saveOrUpdate(p);
			session.saveOrUpdate(l);
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
	public boolean setIngredient(Producte p, Producte p2) {
		Session session = sessionFactory.getCurrentSession();
		p.getComposicio().add(p2);
		p2.getComposicio().add(p);
		try {
			session.beginTransaction();
			session.saveOrUpdate(p);
			session.saveOrUpdate(p2);
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
	public boolean setPeticio(Producte p, PeticioProveidor pp) {
		Session session = sessionFactory.getCurrentSession();
		p.getPeticioProveidor().add(pp);
		pp.setProducte(p);
		try {
			session.beginTransaction();
			session.saveOrUpdate(p);
			session.saveOrUpdate(pp);
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
	public boolean setComanda(Producte p, Comanda c) {
		Session session = sessionFactory.getCurrentSession();
		p.getProducteComanda().add(p); 
		c.getComandes().add(p);
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

}

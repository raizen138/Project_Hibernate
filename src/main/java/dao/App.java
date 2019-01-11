package main.java.dao;

import main.java.dao.LotDao;
import main.java.tastat.Client;
import main.java.tastat.Comanda;
import main.java.tastat.Lot;
import main.java.tastat.Producte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Properties;

import java.util.Set;

import com.mysql.cj.Session;

import main.java.dao.ComandaDao;
import main.java.tastat.UnitatMesura;
import main.java.tastat.Tipus;
import main.java.tastat.ComandaEstat;
import main.java.tastat.Producte;
public class App {

	public static void main(String[] args) {
		initD();
		DaoTest();
	}
	
	static void initD() {
		
	}
	
	static void DaoTest() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		Producte p = new Producte(724, "Dani", 10,1, UnitatMesura.UNITAT, Tipus.VENDIBLE, 10.0);
		Lot l = new Lot(70, 1, date, date, p);
		LotDao ld = new LotDao();
		ld.setProducte(l, p);
		ComandaDao cd = new ComandaDao();
		Set<Comanda> sp = new HashSet<Comanda>();
		Client cl= new Client("this", "that", true, sp, null);
		Comanda c = new Comanda(30,date,date,ComandaEstat.PENDENT,null,null);
		cd.setClient(c, cl);
		cd.setProducte(c, p);
	}
	
}

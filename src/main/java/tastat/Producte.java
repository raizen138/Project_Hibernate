package main.java.tastat;

import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "Producte")
public class Producte{
	
	@Id()
	@Column(name = "codiProducte")
	protected int codiProducte;
	
	@Column(name = "nomProducte")
	protected String nomProducte;
	
	@Column(name = "stock")
	protected int stock;
	
	@Column(name = "stockMinim")
	protected int stockMinim;
	
	@Column(name = "unitat")
	protected UnitatMesura unitat;
	
	@Column(name = "tipus")
	protected Tipus tipus;
	
	@Column(name = "preuVenda")
	protected double preuVenda;
	
	//relacio 1 a n amb lot
	//relacio n a n amb ell mateix
	//relacio 1 a n amb peticionsproveidor
	//relacio n a n amb comanda
	
	
	
	
}
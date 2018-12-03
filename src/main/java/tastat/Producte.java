package main.java.tastat;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "Producte")
public class Producte implements Serializable{
	
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
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipus")
	protected Tipus tipus;
	
	@Column(name = "preuVenda")
	protected double preuVenda;
	
	//relacio 1 a n amb lot
	@OneToMany(mappedBy="Lot")
	private Set<Lot> lotes = new HashSet<>();
	
	//relacio n a n amb ell mateix
	@JoinTable(name="ProducteProducte", joinColumns={@JoinColumn(name="id_producte")}, inverseJoinColumns={@JoinColumn(name="id_producte")})
	@ManyToMany(cascade=CascadeType.REFRESH)
	private Set<Producte> composicio = new HashSet<>();

	//relacio 1 a n amb peticionsproveidor
	@OneToMany(mappedBy="PeticioProveidor")
	private Set<PeticioProveidor> peticioProveidor = new HashSet<>();

	//relacio n a n amb comanda
	@JoinTable(name="ProducteComanda", joinColumns= {@JoinColumn(name="id_Producte")}, inverseJoinColumns= {@JoinColumn(name="id_comanda")})
	@ManyToMany(cascade=CascadeType.REFRESH)
	private Set<Producte> producteComanda = new HashSet<>();

	
	public Producte(int codiProducte, String nomProducte, int stock, int stockMinim, UnitatMesura unitat, Tipus tipus,
			double preuVenda, Set<Lot> lotes, Set<Producte> composicio, Set<PeticioProveidor> peticioProveidor,
			Set<Producte> producteComanda) {
		super();
		this.codiProducte = hashCode();
		this.nomProducte = nomProducte;
		this.stock = stock;
		this.stockMinim = stockMinim;
		this.unitat = unitat;
		this.tipus = tipus;
		this.preuVenda = preuVenda;
		this.lotes = lotes;
		this.composicio = composicio;
		this.peticioProveidor = peticioProveidor;
		this.producteComanda = producteComanda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		// cada clase debe tener un result distinto
		int result = 57764;
		result = prime * result + codiProducte;
		return result;
	}
	
	public int getCodiProducte() {
		return codiProducte;
	}

	public void setCodiProducte(int codiProducte) {
		this.codiProducte = codiProducte;
	}

	public String getNomProducte() {
		return nomProducte;
	}

	public void setNomProducte(String nomProducte) {
		this.nomProducte = nomProducte;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStockMinim() {
		return stockMinim;
	}

	public void setStockMinim(int stockMinim) {
		this.stockMinim = stockMinim;
	}

	public UnitatMesura getUnitat() {
		return unitat;
	}

	public void setUnitat(UnitatMesura unitat) {
		this.unitat = unitat;
	}

	public Tipus getTipus() {
		return tipus;
	}

	public void setTipus(Tipus tipus) {
		this.tipus = tipus;
	}

	public double getPreuVenda() {
		return preuVenda;
	}

	public void setPreuVenda(double preuVenda) {
		this.preuVenda = preuVenda;
	}

	public Set<Lot> getLotes() {
		return lotes;
	}

	public void setLotes(Set<Lot> lotes) {
		this.lotes = lotes;
	}

	public Set<Producte> getComposicio() {
		return composicio;
	}

	public void setComposicio(Set<Producte> composicio) {
		this.composicio = composicio;
	}

	public Set<PeticioProveidor> getPeticioProveidor() {
		return peticioProveidor;
	}

	public void setPeticioProveidor(Set<PeticioProveidor> peticioProveidor) {
		this.peticioProveidor = peticioProveidor;
	}

	public Set<Producte> getProducteComanda() {
		return producteComanda;
	}

	public void setProducteComanda(Set<Producte> producteComanda) {
		this.producteComanda = producteComanda;
	}

	
	
	
	
}
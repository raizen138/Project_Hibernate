package main.java.tastat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "Comanda")
public class Comanda implements Serializable{
	
	@Id 
	@Column(name = "idComanda", nullable = false)
	protected int idComanda;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataComanda", nullable = false)
	protected Date dataComanda;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataLliurament", nullable = false)
	protected Date dataLliurament; 
	
	@Column(name = "estat", nullable = false)
	protected ComandaEstat estat;	//PENDENT - PREPARAT - TRANSPORT - LLIURAT
	
	/*/relacio n a n amb producte*/
	@JoinTable(name="ProducteComanda", joinColumns={@JoinColumn(name="id_producte")}, inverseJoinColumns={@JoinColumn(name="id_comanda")})
	@ManyToMany(cascade=CascadeType.REFRESH)
	private Set<Producte> comandes = new HashSet<>();

	/*/relacio n a 1 amb client*/
	@JoinColumn(name="Comprador", nullable=false)
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Client comprador;

	
	
	public Comanda(int idComanda, Date dataComanda, Date dataLliurament, ComandaEstat estat, Set<Producte> comandes,
			Client comprador) {
		super();
		this.idComanda = hashCode();
		this.dataComanda = dataComanda;
		this.dataLliurament = dataLliurament;
		this.estat = estat;
		this.comandes = comandes;
		this.comprador = comprador;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		// cada clase debe tener un result distinto
		int result = 85421;
		result = prime * result + idComanda;
		return result;
	}
	
	
	public int getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}

	public Date getDataComanda() {
		return dataComanda;
	}

	public void setDataComanda(Date dataComanda) {
		this.dataComanda = dataComanda;
	}

	public Date getDataLliurament() {
		return dataLliurament;
	}

	public void setDataLliurament(Date dataLliurament) {
		this.dataLliurament = dataLliurament;
	}

	public ComandaEstat getEstat() {
		return estat;
	}

	public void setEstat(ComandaEstat estat) {
		this.estat = estat;
	}

	public Set<Producte> getComandes() {
		return comandes;
	}

	public void setComandes(Set<Producte> comandes) {
		this.comandes = comandes;
	}

	public Client getComprador() {
		return comprador;
	}

	public void setComprador(Client comprador) {
		this.comprador = comprador;
	}
	
	

}
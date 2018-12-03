package main.java.tastat;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client implements Serializable{
	@Id
	@Column(name = "CIF",updatable = true, nullable = false)
	protected String CIF;
	
	@Column(name = "nomClient",updatable = true, nullable = false)
	protected String nomClient;
	
	@Column(name = "actiu",updatable = true)
	protected boolean actiu;

	//relacio 1 a n amb comanda
	@OneToMany(mappedBy="Comanda")
	Set<Comanda> comandes = new HashSet<>();

	//relacio 1 a 1 amb adreça
	@JoinColumn(name="Adreca", nullable=false)
	@OneToOne(cascade = CascadeType.PERSIST)
	private Address adreca;
	
	
	public Client(String cIF, String nomClient, boolean actiu, Set<Comanda> comandes, Address adreca) {
		super();
		CIF = cIF;
		this.nomClient = nomClient;
		this.actiu = actiu;
		this.comandes = comandes;
		this.adreca = adreca;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public boolean isActiu() {
		return actiu;
	}

	public void setActiu(boolean actiu) {
		this.actiu = actiu;
	}

	public Set<Comanda> getComandes() {
		return comandes;
	}

	public void setComandes(Set<Comanda> comandes) {
		this.comandes = comandes;
	}

	public Address getAdreca() {
		return adreca;
	}

	public void setAdreca(Address adreca) {
		this.adreca = adreca;
	}

	
}
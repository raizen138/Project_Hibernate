package main.java.tastat;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address implements Serializable{
	
	@Id
	@Column(name = "id",updatable = true, nullable = false)
	protected int id;
	
	@Column(name = "carrer",updatable = true, nullable = false)
	protected String carrer;
	
	@Column(name = "numero",updatable = true)
	protected int numero;
	
	@Column(name = "poblacio",updatable = true, nullable = false)
	protected String poblacio;
	
	@Column(name = "pais",updatable = true, nullable = false)
	protected String pais;
	
	@Column(name = "postal",updatable = true, nullable = false)
	protected String postal;
	
	@Column(name = "telefon",updatable = true)
	protected String telefon;
	
	@Column(name = "latitud",updatable = true)
	protected double latitud;
	
	@Column(name = "longitud",updatable = true)
	protected double longitud;
	
	/*/relacio 1 a 1 amb partner*/
	@JoinColumn(name = "partner", nullable = false)
	@OneToOne(cascade = CascadeType.PERSIST)
	private Proveidor proveidor;
	
	/*/relacio 1 a 1 amb client*/
	@JoinColumn(name = "client", nullable = false)
	@OneToOne(cascade = CascadeType.PERSIST)
	private Client client;
	
	
	public Address(int id, String carrer, int numero, String poblacio, String pais, String postal, String telefon,
			double latitud, double longitud, Proveidor proveidor, Client client) {
		super();
		this.id = hashCode();
		this.carrer = carrer;
		this.numero = numero;
		this.poblacio = poblacio;
		this.pais = pais;
		this.postal = postal;
		this.telefon = telefon;
		this.latitud = latitud;
		this.longitud = longitud;
		this.proveidor = proveidor;
		this.client = client;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		// cada clase debe tener un result distinto
		int result = 4394;
		result = prime * result + id;
		return result;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarrer() {
		return carrer;
	}

	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPoblacio() {
		return poblacio;
	}

	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public Proveidor getProveidor() {
		return proveidor;
	}

	public void setProveidor(Proveidor proveidor) {
		this.proveidor = proveidor;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
package main.java.tastat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address{
	
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
	
	
	//relacio 1 a 1 amb partner
	//relacio 1 a 1 amb client
}
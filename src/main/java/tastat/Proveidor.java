package main.java.tastat;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "Proveidor")
public class Proveidor{
	
	@Id
	@Column(name = "idProveidor")
	protected int idProveidor;
	
	@Column(name = "nomProveidor")
	protected String nomProveidor;
	
	@Column(name = "CIF")
	protected String CIF;
	
	@Column(name = "actiu")
	protected boolean actiu;
	
	@Column(name = "personaContacte")
	protected String personaContacte;
	
	//relacio 1 a 1 amb address
	//relacio 1 a n amb peticioproveidor
	
}
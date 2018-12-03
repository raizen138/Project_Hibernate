package main.java.tastat;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client{
	@Id
	@Column(name = "CIF",updatable = true, nullable = false)
	protected String CIF;
	
	@Column(name = "nomClient",updatable = true, nullable = false)
	protected String nomClient;
	
	@Column(name = "actiu",updatable = true)
	protected boolean actiu;

	//relacio 1 a n amb comanda
	//relacio 1 a 1 amb adreça
}
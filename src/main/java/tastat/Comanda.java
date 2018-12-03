package main.java.tastat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Comanda")
public class Comanda {
	
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
	
	//relacio n a n amb producte
	//relacio n a 1 amb client
}
package main.java.tastat;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name = "Lot")
public class Lot{
	@Id
	@Column(name = "id", nullable = false)
	int id;
	
	@Column(name = "quantitat", nullable = false)
	int quantitat;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataEntrada", nullable = false)
	Date dataEntrada = new Date();
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataCaducitat")
	Date dataCaducitat = null;
	
	//relacio n a 1 amb producte
	
	
}
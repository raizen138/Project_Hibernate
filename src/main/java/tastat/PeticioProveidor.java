package main.java.tastat;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "PeticioProveidor")
public class PeticioProveidor {
	
	@Id
	@Column(name = "idComanda", updatable = true, nullable = false)
	protected int idComanda;
	
	@Column(name = "tipusPeticio")
	protected int tipusPeticio;
	
	@Column(name = "dataOrdre")
	protected Date dataOrdre;
	
	@Column(name = "dataRecepcio")
	protected Date dataRecepcio;   
	
	@Column(name = "estat")
	protected ComandaEstat estat;
	
	//relacio n a 1 amb proveidor
	//relacio n a 1 amb producte

}

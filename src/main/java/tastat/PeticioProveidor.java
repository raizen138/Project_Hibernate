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
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estat")
	protected ComandaEstat estat;
	
	//relacio n a 1 amb proveidor
	@ManyToOne
	@JoinColumn(name = "proveidor")
	private Proveidor proveidor;

	//relacio n a 1 amb producte
	@ManyToOne
	@JoinColumn(name = "producte")
	private Producte producte;

	public PeticioProveidor(int idComanda, int tipusPeticio, Date dataOrdre, Date dataRecepcio, ComandaEstat estat,
			Proveidor proveidor, Producte producte) {
		super();
		this.idComanda = hashCode();
		this.tipusPeticio = tipusPeticio;
		this.dataOrdre = dataOrdre;
		this.dataRecepcio = dataRecepcio;
		this.estat = estat;
		this.proveidor = proveidor;
		this.producte = producte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		// cada clase debe tener un result distinto
		int result = 3479;
		result = prime * result + idComanda;
		return result;
	}
	
	public int getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}

	public int getTipusPeticio() {
		return tipusPeticio;
	}

	public void setTipusPeticio(int tipusPeticio) {
		this.tipusPeticio = tipusPeticio;
	}

	public Date getDataOrdre() {
		return dataOrdre;
	}

	public void setDataOrdre(Date dataOrdre) {
		this.dataOrdre = dataOrdre;
	}

	public Date getDataRecepcio() {
		return dataRecepcio;
	}

	public void setDataRecepcio(Date dataRecepcio) {
		this.dataRecepcio = dataRecepcio;
	}

	public ComandaEstat getEstat() {
		return estat;
	}

	public void setEstat(ComandaEstat estat) {
		this.estat = estat;
	}

	public Proveidor getProveidor() {
		return proveidor;
	}

	public void setProveidor(Proveidor proveidor) {
		this.proveidor = proveidor;
	}

	public Producte getProducte() {
		return producte;
	}

	public void setProducte(Producte producte) {
		this.producte = producte;
	}

	
}

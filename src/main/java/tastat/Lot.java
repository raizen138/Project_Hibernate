package main.java.tastat;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name = "Lot")
public class Lot implements Serializable{
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
	
	/*/relacio n a 1 amb producte*/
	@ManyToOne
	@JoinColumn(name = "producte")
	private Producte producte;

	
	public Lot(int id, int quantitat, Date dataEntrada, Date dataCaducitat, Producte producte) {
		super();
		this.id = hashCode();
		this.quantitat = quantitat;
		this.dataEntrada = dataEntrada;
		this.dataCaducitat = dataCaducitat;
		this.producte = producte;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		// cada clase debe tener un result distinto
		int result = 12334;
		result = prime * result + id;
		return result;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataCaducitat() {
		return dataCaducitat;
	}

	public void setDataCaducitat(Date dataCaducitat) {
		this.dataCaducitat = dataCaducitat;
	}

	public Producte getProducte() {
		return producte;
	}

	public void setProducte(Producte producte) {
		this.producte = producte;
	}

	
	
}
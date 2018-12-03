package main.java.tastat;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "Proveidor")
public class Proveidor implements Serializable{
	
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
	@JoinColumn(name = "address", nullable = false)
	@OneToOne(cascade = CascadeType.PERSIST)
	private Address address;

	//relacio 1 a n amb peticioproveidor
	@OneToMany(mappedBy = "PeticionsProvedor")
	Set<PeticioProveidor> peticionsProvedor = new HashSet<PeticioProveidor>();

	
	
	public Proveidor(int idProveidor, String nomProveidor, String cIF, boolean actiu, String personaContacte,
			Address address, Set<PeticioProveidor> peticionsProvedor) {
		super();
		this.idProveidor = hashCode();
		this.nomProveidor = nomProveidor;
		CIF = cIF;
		this.actiu = actiu;
		this.personaContacte = personaContacte;
		this.address = address;
		this.peticionsProvedor = peticionsProvedor;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		// cada clase debe tener un result distinto
		int result = 1432;
		result = prime * result + idProveidor;
		return result;
	}

	
	public int getIdProveidor() {
		return idProveidor;
	}

	public void setIdProveidor(int idProveidor) {
		this.idProveidor = idProveidor;
	}

	public String getNomProveidor() {
		return nomProveidor;
	}

	public void setNomProveidor(String nomProveidor) {
		this.nomProveidor = nomProveidor;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public boolean isActiu() {
		return actiu;
	}

	public void setActiu(boolean actiu) {
		this.actiu = actiu;
	}

	public String getPersonaContacte() {
		return personaContacte;
	}

	public void setPersonaContacte(String personaContacte) {
		this.personaContacte = personaContacte;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<PeticioProveidor> getPeticionsProvedor() {
		return peticionsProvedor;
	}

	public void setPeticionsProvedor(Set<PeticioProveidor> peticionsProvedor) {
		this.peticionsProvedor = peticionsProvedor;
	}

	
	
}
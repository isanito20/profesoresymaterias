package model;

public class Docente {
	public int id;
	public String nombreCompleto;
	/**
	 * 
	 */
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nombreCompleto
	 */
	public Docente(int id, String nombreCompleto) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	@Override
	public String toString() {
		return nombreCompleto;
	}
	
	
	

}

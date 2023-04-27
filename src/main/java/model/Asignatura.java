package model;

public class Asignatura {
	public int id;
	public String denominacion;
	
	
	/**
	 * 
	 */
	public Asignatura() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param denominacion
	 */
	public Asignatura(int id, String denominacion) {
		super();
		this.id = id;
		this.denominacion = denominacion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
	
	
}

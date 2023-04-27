package model;

public class AsignaturaDocente {
	public int id;
	public int idAsignatura;
	public int idDocente;
	/**
	 * 
	 */
	public AsignaturaDocente() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param idAsignatura
	 * @param idDocente
	 */
	public AsignaturaDocente(int id, int idAsignatura, int idDocente) {
		super();
		this.id = id;
		this.idAsignatura = idAsignatura;
		this.idDocente = idDocente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	public int getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}
	
	

}

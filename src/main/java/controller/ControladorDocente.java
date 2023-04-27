package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Docente;

public class ControladorDocente {
	public static List<Docente> filtrarDocente(String docente) {
		List<Docente> lista = new ArrayList<Docente>();

		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) ConnectionManagerJPA.getConexion().createStatement();

			ResultSet rs = s.executeQuery("select * from docente where nombreCompleto like '%" + docente + "%'");

			// Navegación del objeto ResultSet
			while (rs.next()) {
				Docente i = new Docente(rs.getInt("id"), rs.getString("nombreCompleto"));
				lista.add(i);
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

		return lista;
	}

	/**
	 * 
	 */
	public static int modificar(Docente d) {
		int registrosAfectados = 0;
		try {
			PreparedStatement ps = ConnectionManagerJPA.getConexion()
					.prepareStatement("update docente set nombreCompleto = ?, where id = ?");
			ps.setInt(1, d.getId());
			ps.setString(2, d.getNombreCompleto());
			registrosAfectados = ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return registrosAfectados;
	}

	public static List<Docente> obtenerTodosLasdocentes() {
		List<Docente> lista = new ArrayList<Docente>();

		try {
			Statement s = (Statement) ConnectionManagerJPA.getConexion().createStatement();
			ResultSet rs = s.executeQuery("select * from docente");

			// Navegación del objeto ResultSet
			while (rs.next()) {
				Docente p = new Docente(rs.getInt("id"), rs.getString("docente"));
				lista.add(p);
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

		return lista;
	}

}

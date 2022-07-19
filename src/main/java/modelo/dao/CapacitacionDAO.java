package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelo.Capacitacion;

public class CapacitacionDAO implements ICapacitacionDAO {

	@Override
	public void crear(Capacitacion cap) {
		
		try {
		String query = "INSERT INTO capacitacion (rut, dia, hora, lugar, duracion, c_asistentes) Values " +
				"("+ cap.getRut() + ", '" + cap.getDia() + "', '" + cap.getHora() + "', '" + cap.getLugar() + 
				"', '" + cap.getDuracion() + "', " + cap.getC_asistentes() + ")";
		
		Connection con = Conexion.getConexion();
		Statement smt = con.createStatement();
		smt.execute(query);
		} catch (SQLException e) {
			System.out.println("Error en conexion crear");
			e.printStackTrace();
		}

	}

	@Override
	public List<Capacitacion> leerCapacitaciones() {
		
		List<Capacitacion> listado = new ArrayList<>();
		
		try {
			String query = "SELECT id, rut, dia, hora, lugar, duracion, c_asistentes FROM capacitacion";
			
			Connection con = Conexion.getConexion();		
		
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery(query);
			
			while (rs.next()) {
				listado.add(new Capacitacion(rs.getInt("id"), rs.getInt("rut"), 
											 rs.getString("dia"), rs.getString("hora"), 
											 rs.getString("lugar"), rs.getString("duracion"),
											 rs.getInt("c_asistentes")));
			}			
			
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}		
		return listado;
	}

	@Override
	public Capacitacion leerCapacitacion(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Capacitacion cap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

}

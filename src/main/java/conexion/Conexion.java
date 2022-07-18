package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static Connection conexion = null;
	private String rutaString = "jdbc:mysql://127.0.0.1:3308/asesorias";
	private String userString = "root";
	private String passString = "1234";
	
	private Conexion() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(rutaString, userString, passString);
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error en la conexion Class");
			e.printStackTrace();
		}
	}
	
	public static Connection getConexion() {
		if (conexion == null) {
			new Conexion();
		}		
		return conexion;
	}
}

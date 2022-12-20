package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/fp2","fp2","12345678");

public class Conexion {
	
	public static Connection conexion = null;
	
	public Conexion() {}
	
	private synchronized static void createConexion() throws SQLException {
        if (conexion == null) { 
        	conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/fp2","fp2","12345678");
        }
    }
		
		

	public static Connection getConexion() throws SQLException {
		if (conexion == null) createConexion();
        return conexion;
	}
	
	

}

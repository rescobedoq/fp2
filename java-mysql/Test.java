package test;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			System.out.println(":)");			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(":(");
		}
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/fp2","fp2","12345678");
			
			System.out.println(conexion.getClass().hashCode());
			
			Statement stmt = conexion.createStatement();  
			ResultSet rs = stmt.executeQuery("select * from pet");  
			while(rs.next()) {  
				System.out.println(rs.getString(1) + "|" +  rs.getString(2) + "|" +  rs.getString(3));  
			  
			}
			conexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

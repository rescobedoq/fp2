package test;

import java.sql.*;

public class Test3 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub		
		
		Conexion cn = new Conexion();		
		
			
			System.out.println(cn.getClass().hashCode());
			
			Statement stmt = cn.getConexion().createStatement() ; 
			ResultSet rs = stmt.executeQuery("select * from pet");  
			while(rs.next()) {  
				System.out.println(rs.getString(1) + "|" +  rs.getString(2) + "|" +  rs.getString(3));  
			  
			
			
			}			

	

}
}

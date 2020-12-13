package SeleniumFirstScript;

import java.sql.*;

public class JDBC_SQLConnection {
	
	public static void main(String[] args) {
		
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" + 
					            "databaseName=PlayGround;integratedSecurity=true;";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			con = DriverManager.getConnection(connectionUrl);
			System.out.println("Connection Establioshed");
			
			String SQL = "SELECT * from JDBC_TEST";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +  rs.getString(3) + " " +  rs.getString(4));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

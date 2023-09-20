package config;

import java.sql.*;
//Holahh

public class Conexion {

	public static String drv = "com.mysql.cj.jdbc.Driver";
	public static String user = "root";
	public static String pass = "123456";
	public static String url = "jdbc:mysql://localhost:3306/schoolsystem";
	public static Connection con;

	public Connection getConexion() {
		try {
			Class.forName(drv);
			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			System.out.println("ERROR " + e);
		}
		return con;
	}
}

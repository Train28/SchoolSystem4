package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.Conexion;

public class ClaseManagement {

	Conexion con = new Conexion();
	Connection conn = con.getConexion();

	public void insert(int id, String section, String time_class, int id_subject) {

		Clase cl = new Clase(id, section, time_class, id_subject);

		try {
			String sql = "insert into class(id_class,section,time_class,id_number_subject)" + "values(?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, cl.getId_class());
			stmt.setString(2, cl.getSection());
			stmt.setString(3, cl.getTime_class());
			stmt.setInt(4, cl.getId_subject());
			stmt.execute();
		} catch (Exception e) {
			System.out.println("Error :" + e);
		}

	}

	public void delete(int id) {

		try {
			String sql = "delete from class where id_class =" + id;
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.execute();
		} catch (Exception e) {
			System.out.println("Error :" + e);
		}

	}
	
	public void select() {
		try {
			String sql = "select * from class";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();			
			while (rs.next()) {
				int id = rs.getInt("id_class");
				String section = rs.getString("section");
				String time_class = rs.getString("time_class");
				int id_s = rs.getInt("id_number_subject");
				System.out.println(id + "|| " + section+"|| " + time_class+"|| " + id_s);
			}			
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		
		
	}


}

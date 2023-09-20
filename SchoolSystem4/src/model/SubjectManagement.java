package model;

import java.sql.*;

import config.Conexion;

public class SubjectManagement extends Conexion {

	Connection conn = getConexion();

	public void insertSubject(int id_number_subject, String name_subject) {

		Subject sub = new Subject(id_number_subject, name_subject);
		try {
			String sql = "insert into subject (id_number_subject,name_subject) values (?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, sub.getIdSubject());
			stmt.setString(2, sub.getNameSubject());
			stmt.execute();
		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
	}

	public void deleteSubject(int id_sub) {
		try {
			String sql = "delete from subject where id_number_subject =" + id_sub + "";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.execute();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}

	public void selectSubject() {

		try {
			String sql = "select * from subject";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id_number_subject");
				String name = rs.getString("name_subject");
				System.out.println(id + "||" + name);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}

package model;

import java.sql.*;
import java.util.Iterator;

import config.Conexion;

public class TeacherManagement {

	Conexion c = new Conexion();
	Connection conn = c.getConexion();

	public void insertTeacher(int idTeacher, String nameTeacher, String address, int age, double salary,
			int teachingHours) {

		Teacher t = new Teacher(idTeacher, nameTeacher, address, age, salary, teachingHours);

		try {
			String sql = "insert into teacher(id_teacher,name_teacher,address,age_teacher,salary,teaching_hours)"
					+ "values(?,?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, t.getDni());
			stmt.setString(2, t.getName());
			stmt.setString(3, t.getAddress());
			stmt.setInt(4, t.getAge());
			stmt.setDouble(5, t.getSalary());
			stmt.setInt(6, t.getTeachingHours());
			stmt.execute();
		} catch (Exception e) {
			System.out.println("Error :"+e);
		}

	}

	public void deleteTeacher(int id_t) {

		try {
			String sql = "delete from teacher where id_teacher =" + id_t + "";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.execute();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

	}

	public void selectTeacher() {

		try {
			String sql = "select * from teacher";
			// PreparedStatement stmt = conn.prepareStatement(sql);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id_teacher");
				String name = rs.getString("name_teacher");
				String address = rs.getString("address");
				int age = rs.getInt("age_teacher");
				double salary = rs.getDouble("salary");
				int teachHours = rs.getInt("teaching_hours");
				System.out.println(id + "/ " + name + "/ " + address + "/ " + age + "/ " + salary + "/ " + teachHours);
			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}

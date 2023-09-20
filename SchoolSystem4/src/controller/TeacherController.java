package controller;

import model.TeacherManagement;
import view.View;

public class TeacherController {	

	TeacherManagement tm = new TeacherManagement();
	View vista = new View();

	public void insertTeacher(int idTeacher, String nameTeacher, String address, int age, double salary,
			int teachingHours) {
		
		tm.insertTeacher(idTeacher, nameTeacher, address, age, salary, teachingHours);
		vista.registro();

	}

	public void deleteTeacher(int id) {
		
		tm.deleteTeacher(id);
		vista.borrar();
	}

	public void selectTeacher() {
		tm.selectTeacher();

	}

}

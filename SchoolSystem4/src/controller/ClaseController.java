package controller;

import model.ClaseManagement;
import view.View;

public class ClaseController {

	ClaseManagement clm = new ClaseManagement();
	View vista = new View();

	public void insert(int id, String section, String time, int id_subject) {
		
		clm.insert(id,  section, time,  id_subject);
		vista.registro();

	}

	public void delete(int id) {
		
		clm.delete(id);
		vista.borrar();
	}

	public void select() {
		
		clm.select();

	}

}

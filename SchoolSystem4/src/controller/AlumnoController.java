package controller;

import model.AlumnoManagement;
import view.View;

public class AlumnoController {
	
	AlumnoManagement alm = new AlumnoManagement();
	View vista = new View();
	
	
	
	public void insert(int id, String name, String address, int age, double pension) {	
		
		alm.insert(id, name, address, age, pension);		
		vista.registro();
				
	}

	public void delete(int id) {
		alm.delete(id);
		vista.borrar();
	}
	
	public void select() {
		alm.select();
		
	}
}

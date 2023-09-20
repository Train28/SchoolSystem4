package controller;

import model.SubjectManagement;
import view.View;

public class SubjectController {
	
	SubjectManagement subm = new SubjectManagement();
	View vista = new View();

	public void insert(int id, String name) {
		
		subm.insertSubject(id,  name);
		vista.registro();

	}

	public void delete(int id) {
		subm.deleteSubject(id);
		vista.borrar();
	}

	public void select() {
		subm.selectSubject();

	}

}

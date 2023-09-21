package view;

import model.*;

import java.util.*;

import controller.AlumnoController;
import controller.ClaseController;
import controller.SubjectController;
import controller.TeacherController;

public class View {
	
	public static void main(String[] args) {
		System.out.println("Write the number u want to register");
		System.out.println("1. Subject" + "\n" + "2. Teacher" + "\n" + "3. Student" + "\n" + "4. Class");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int p;

		if (key == 1) {
			int idSubject;
			String nameSubject;
			SubjectController subm = new SubjectController();
			System.out.println("Write the number of the action u want to do");
			System.out.println("1. Insert new subject" + "\n" + "2. Show all the subjects" + "\n" + "3. Delete subject using ID");
			p = sc.nextInt();

			switch (p) {
			case 1:
				System.out.println("Enter Id Subject");
				idSubject = sc.nextInt();
				System.out.println("Enter name Subject");
				nameSubject = sc.next();
				subm.insert(idSubject, nameSubject);
				break;
			case 2:
				subm.select();
				break;
			case 3:
				System.out.println("Enter Id Number");
				idSubject = sc.nextInt();
				subm.delete(idSubject);
				break;
			default:
				break;
			}

		} else if (key == 2) {
			int idTeacher, age, teachingHours;
			String nameTeacher, address;
			double salary;
			TeacherController tm = new TeacherController();
			System.out.println("Write the number of the action u want to do");
			System.out.println(
					"1. Insert new teacher" + "\n" + "2. Show all the teachers" + "\n" + "3. Delete teacher using ID");
			p = sc.nextInt();

			switch (p) {
			case 1:
				System.out.println("Enter Id Number");
				idTeacher = sc.nextInt();
				System.out.println("Enter name teacher");
				nameTeacher = sc.next();
				System.out.println("Enter address");
				address = sc.next();
				System.out.println("Enter age");
				age = sc.nextInt();
				System.out.println("Enter salary");
				salary = sc.nextDouble();
				System.out.println("Enter how many hours the teacher work");
				teachingHours = sc.nextInt();
				tm.insertTeacher(idTeacher, nameTeacher, address, age, salary, teachingHours);
				break;
			case 2:
				tm.selectTeacher();
				break;
			case 3:
				System.out.println("Enter Id Number");
				idTeacher = sc.nextInt();
				tm.deleteTeacher(idTeacher);
				break;
			default:
				break;
			}

		} else if (key == 3) {

			int id, age;
			String name, address;
			double pension;
			AlumnoController alm = new AlumnoController();
			System.out.println("Write the number of the action u want to do");
			System.out.println(
					"1. Insert new student" + "\n" + "2. Show all the students" + "\n" + "3. Delete student using ID");
			p = sc.nextInt();

			switch (p) {
			case 1:
				System.out.println("Enter Id Student");
				id = sc.nextInt();
				System.out.println("Enter name Student");
				name = sc.next();
				System.out.println("Enter address");
				address = sc.next();
				System.out.println("Enter age");
				age = sc.nextInt();
				System.out.println("Enter pension");
				pension = sc.nextDouble();
				alm.insert(id, name, address, age, pension);
				break;
			case 2:
				alm.select();
							
				break;
			case 3:
				System.out.println("Enter Id Number");
				id = sc.nextInt();
				alm.delete(id);
			}

		} else if (key == 4) {

			int id, idSubject;
			String section, time;
			ClaseController clm = new ClaseController();
			System.out.println("Write the number of the action u want to do");
			System.out.println(
					"1. Insert new class" + "\n" + "2. Show all the class" + "\n" + "3. Delete class using ID");
			p = sc.nextInt();

			switch (p) {
			case 1:
				System.out.println("Enter Id Class");
				id = sc.nextInt();
				System.out.println("Enter Section");
				section = sc.next();
				System.out.println("Enter Time Class");
				time = sc.next();
				System.out.println("Enter Id Subject");
				idSubject = sc.nextInt();
				clm.insert(id, section, time, idSubject);
				break;
			case 2:
				clm.select();
				break;
			case 3:
				System.out.println("Enter Id Class");
				id = sc.nextInt();
				clm.delete(id);
			}

		}
	}
	
	
	public void registro(){
		System.out.println("Registro exitoso");
	}
	
	public void borrar(){
		System.out.println("Borrado exitoso");

	}
	
	
	

}

package model;

public class Teacher extends Person {

	private int teachingHours;
	private double salary;

	public Teacher(int dni, String name, String address, int age, double salary, int teachingHours) {
		super(dni, name, address, age);
		this.teachingHours = teachingHours;
		this.salary = salary;
	}

	public int getTeachingHours() {
		return teachingHours;
	}

	public void setTeachingHours(int teachingHours) {
		this.teachingHours = teachingHours;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
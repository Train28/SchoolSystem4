package model;

public class Alumno extends Person {

	private double pension;

	public Alumno(int dni, String name, String address, int age, double pension) {
		super(dni, name, address, age);
		this.pension = pension;
	}
	
	public double getPension() {
		return pension;
	}

	public void setPension(double pension) {
		this.pension = pension;
	}

}

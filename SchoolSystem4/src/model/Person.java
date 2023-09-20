package model;

public abstract class Person {

	private int dni;
	private String name;
	private String address;
	private int age;

	public Person(int dni, String name, String address, int age) {
		this.dni = dni;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

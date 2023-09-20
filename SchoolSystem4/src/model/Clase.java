package model;

public class Clase {
	
	private int id_class;
	private String section;
	private String time_class;
	private int id_subject;

	public Clase(int id_class, String section, String time_class, int id_subject) {
		this.id_class = id_class;
		this.section = section;
		this.time_class = time_class;
		this.id_subject = id_subject;
	}

	public int getId_class() {
		return id_class;
	}

	public void setId_class(int id_class) {
		this.id_class = id_class;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getTime_class() {
		return time_class;
	}

	public void setTime_class(String time_class) {
		this.time_class = time_class;
	}

	public int getId_subject() {
		return id_subject;
	}

	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}

}

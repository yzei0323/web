package day06Prac;

public class Nct {

	String name;
	String birthday;
	
	
	public Nct(String name, String birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}


	public Nct() {
		
	}


	@Override
	public String toString() {
		return "Nct [name=" + name + ", birthday=" + birthday + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	
}

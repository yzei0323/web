package practice;

public class Acorn2 {

	String id;
	String pw;
	String name;
	
	
	public Acorn2(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public Acorn2() {
		
	}
	@Override
	public String toString() {
		return "Acorn2 [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}

	
	
	
}

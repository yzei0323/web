package 시험연습;

public class Acorn3 {

	
	String id;
	String pw; 
	String name;
	
	
	public Acorn3(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public Acorn3() {

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Acorn3 [id=" + id + ", pw=" + pw + ", name=" + name + "]";
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

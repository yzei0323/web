package Practice;

public class User {

	String id;
	String pw;
	String nick;
	
	
	public User(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + ", nick=" + nick + "]";
	}


	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public String getName() {
		return nick;
	}

	
	
	
}



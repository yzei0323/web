package examPrj;

public class Actor {

	String actor_id;
	String first_name;
	String last_name;
	String gender;
	
	
	public Actor(String actor_id, String first_name, String last_name, String gender) {
		super();
		this.actor_id = actor_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
	}


	public Actor() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Actor [actor_id=" + actor_id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender="
				+ gender + "]";
	}


	public String getActor_id() {
		return actor_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public String getGender() {
		return gender;
	}

	
	
}

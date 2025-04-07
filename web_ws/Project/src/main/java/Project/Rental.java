package Project;

public class Rental {

	String rental_id;
	String member_id;
	String book_id;
	String rental_date;
	String return_date;
	String return_status;
	
	public Rental(String rental_id, String member_id, String book_id, String rental_date, String return_date, String return_status) {
		this.rental_id = rental_id;
		this.member_id = member_id;
		this.book_id = book_id;
		this.rental_date = rental_date;
		this.return_date = return_date;
		this.return_status = return_status;
	}

	public Rental() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rental [rental_id=" + rental_id + ", member_id=" + member_id + ", book_id=" + book_id + ", rental_date="
				+ rental_date + ", return_date=" + return_date + ", return_status=" + return_status + "]";
	}

	public String getRental_id() {
		return rental_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public String getBook_id() {
		return book_id;
	}

	public String getRental_date() {
		return rental_date;
	}

	public String getReturn_date() {
		return return_date;
	}

	public String getReturn_status() {
		return return_status;
	}
	
	
	
	
	
	
	
}

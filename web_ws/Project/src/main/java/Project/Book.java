package Project;

public class Book {

	String B_ID;
	String B_TITLE;
	String B_AUTHOR;
	String B_PUBLISHER;
	String B_RENTAL_STATUS;
	String B_IMG;
	
	public String getB_ID() {
		return B_ID;
	}
	public void setB_ID(String b_ID) {
		B_ID = b_ID;
	}
	public String getB_TITLE() {
		return B_TITLE;
	}
	public void setB_TITLE(String b_TITLE) {
		B_TITLE = b_TITLE;
	}
	public String getB_AUTHOR() {
		return B_AUTHOR;
	}
	public void setB_AUTHOR(String b_AUTHOR) {
		B_AUTHOR = b_AUTHOR;
	}
	public String getB_PUBLISHER() {
		return B_PUBLISHER;
	}
	public void setB_PUBLISHER(String b_PUBLISHER) {
		B_PUBLISHER = b_PUBLISHER;
	}
	public String getB_RENTAL_STATUS() {
		return B_RENTAL_STATUS;
	}
	public void setB_RENTAL_STATUS(String b_RENTAL_STATUS) {
		B_RENTAL_STATUS = b_RENTAL_STATUS;
	}
	public String getB_IMG() {
		return B_IMG;
	}
	public void setB_IMG(String b_IMG) {
		B_IMG = b_IMG;
	}
	@Override
	public String toString() {
		return "Book [B_ID=" + B_ID + ", B_TITLE=" + B_TITLE + ", B_AUTHOR=" + B_AUTHOR + ", B_PUBLISHER=" + B_PUBLISHER
				+ ", B_RENTAL_STATUS=" + B_RENTAL_STATUS + ", B_IMG=" + B_IMG + "]";
	}
	public Book(String b_ID, String b_TITLE, String b_AUTHOR, String b_PUBLISHER, String b_RENTAL_STATUS,
			String b_IMG) {
		super();
		B_ID = b_ID;
		B_TITLE = b_TITLE;
		B_AUTHOR = b_AUTHOR;
		B_PUBLISHER = b_PUBLISHER;
		B_RENTAL_STATUS = b_RENTAL_STATUS;
		B_IMG = b_IMG;
	}
	
	public Book() {
		
	}
	
}










//B_ID VARCHAR2(10) PRIMARY KEY NOT NULL ,
//B_TITLE VARCHAR2(90) NOT NULL,
//B_AUTHOR VARCHAR2(50) DEFAULT '무명' NOT NULL,
//B_PUBLISHER VARCHAR2(50) NOT NULL,
//B_RENTAL_STATUS VARCHAR2(1) DEFAULT 'Y' NOT NULL,
//B_IMG VARCHAR(500) NOT NULL,
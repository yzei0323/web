package Project;

import java.sql.Date;

public class Member {
	
	String M_CODE;
	String M_NAME;
	String M_ID;
	String M_TEL;
	String M_BIRTHDAY;
	String M_RENTAL_LEFT;
	
	public String getM_CODE() {
		return M_CODE;
	}
	public void setM_CODE(String m_CODE) {
		M_CODE = m_CODE;
	}
	public String getM_NAME() {
		return M_NAME;
	}
	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}
	public String getM_ID() {
		return M_ID;
	}
	public void setM_ID(String m_ID) {
		M_ID = m_ID;
	}
	public String getM_TEL() {
		return M_TEL;
	}
	public void setM_TEL(String m_TEL) {
		M_TEL = m_TEL;
	}
	public String getM_BIRTHDAY() {
		return M_BIRTHDAY;
	}
	public void setM_BIRTHDAY(String m_BIRTHDAY) {
		M_BIRTHDAY = m_BIRTHDAY;
	}
	public String getM_RENTAL_LEFT() {
		return M_RENTAL_LEFT;
	}
	public void setM_RENTAL_LEFT(String m_RENTAL_LEFT) {
		M_RENTAL_LEFT = m_RENTAL_LEFT;
	}
	
	public Member(String m_CODE, String m_NAME, String m_ID, String m_TEL, String m_birthday, String m_RENTAL_LEFT) {
		super();
		M_CODE = m_CODE;
		M_NAME = m_NAME;
		M_ID = m_ID;
		M_TEL = m_TEL;
		M_BIRTHDAY = m_birthday;
		M_RENTAL_LEFT = m_RENTAL_LEFT;
	}
	
	public Member() {
		
	}
	
	@Override
	public String toString() {
		return "Book [M_CODE=" + M_CODE + ", M_NAME=" + M_NAME + ", M_ID=" + M_ID + ", M_TEL=" + M_TEL + ", M_BIRTHDAY="
				+ M_BIRTHDAY + ", M_RENTAL_LEFT=" + M_RENTAL_LEFT + "]";
	}
	
	
	
}

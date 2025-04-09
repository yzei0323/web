package day08Prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	Connection con = null;
	
	
	private Connection dbCon() {		
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) { System.out.println("db ok");}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

	
	public ArrayList<Member> selectPage(int currentPage){
		
		ArrayList<Member> list = new ArrayList<>();
		int start; 
		int end;
		start = (currentPage-1) * 2 +1;   // 1=> 1	2=> 6
		end = currentPage * 2;		   	  //  => 5	 => 10
				
		Connection con = dbCon();
		String sql = "select * "
				+ "from"
				+ "(select  rownum num,  m_id, m_pw, m_name , m_tel, m_birthday, m_point , m_grade from member_tbl_11)"
				+ "where num  between  ? and  ?";
		
		System.out.println("sql" + sql);
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, start);
			pst.setInt(2, end);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String m_id = rs.getString(2);
				String m_pw = rs.getString(3);
				String m_name = rs.getString(4);
				String m_tel = rs.getString(5);
				String m_birthday = rs.getString(6);
				int m_point = rs.getInt(7);
				String m_grade = rs.getString(8);
				
				Member m = new Member(m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade);
			
				list.add(m);
			}
			
			//마무리
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	//selectAll
	public ArrayList<Member> selectAll(){
		ArrayList<Member> list = new ArrayList<>();
		Connection con = dbCon();
		
		String sql= "select * from member_tbl_11";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) { //쿼리 결과 한 행씩 가져오기-
				String m_id = rs.getString(1);
				String m_pw = rs.getString(2);
				String m_name = rs.getString(3);
				String m_tel = rs.getString(4);
				String m_birthday = rs.getString(5);
				int m_point = rs.getInt(6);
				String m_grade = rs.getString(7);
				

				Member m = new Member(m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade);
			
				list.add(m);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}
	
	
	public int  getTotal(){	
		
		Connection con  = dbCon();		  
		int count=0;			 
		try {
			String sql =" select count(*) from member_tbl_11 ";
			PreparedStatement pst  =con.prepareStatement(sql);	
			 
			ResultSet rs = pst.executeQuery();
				
			if( rs.next()) {
				count = rs.getInt(1);
			}	
				
			rs.close();
			pst.close();
			con.close();
				
		} catch (SQLException e) {			 
			e.printStackTrace();
		}	 
			return count;
	}

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		// dao.dbCon();
		ArrayList<Member> list = dao.selectPage(1);
		System.out.println(list);

		int cnt  =dao.getTotal();
		System.out.println( cnt);

	}

}

package Project;

import java.sql.*;
import java.util.ArrayList;


// 도서정보 DAO
public class Lib_MemberDAO{

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	//연결메서드
	Connection getConnection(){
			
		Connection con = null;
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				System.out.println("db check");
			}else {
				System.out.println("db dosen't connection");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	
	
	//조회하기
	public ArrayList<Member> selectAll(){
		
		ArrayList<Member> list = new ArrayList<>();
		
		Connection con = getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select * from LIB_MEMBER";
		
		try {
	
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String m_code = rs.getString(1);
				String m_name = rs.getString(2);
				String m_id = rs.getString(3);
				String m_tel = rs.getString(4);
				String m_birthday = rs.getString(5);
				String m_rental_left = rs.getString(6);
				
				Member m = new Member( m_code, m_name, m_id, m_tel, m_birthday, m_rental_left);
				list.add(m);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return list;
		
	}
	
	
	
	//한 개 조회
		public Member selectOne(String code) {
			//디비연결
			Connection con = getConnection();
			
			Member acorn = null;
			
			//sql작성
			String sql = "select * from lib_member where m_code = ?";
			
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, code);
				
				ResultSet rs = pst.executeQuery(); 
				
				if(rs.next()) {
					String tcode = rs.getString(1);
					String name = rs.getString(2);
					String id = rs.getString(3);
					String tel = rs.getString(4);
					String birth = rs.getString(5);
					String left_rental = rs.getString(6);
					
					acorn = new Member(tcode,name,id,tel,birth,left_rental);
					
				}
				
				//마무리
				rs.close();
				pst.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//실행결과 Acorn 객체반환
			return acorn;
		
		}
	
		//등록하기
		public void insert(Member member) {
			//데베연결
			Connection con = getConnection();
			String sql = "insert into lib_member(m_code,m_name,m_id,m_tel,m_birthday) values(?,?,?,?,?)";
			
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				
				//왼쪽 물음표부터 채운다 1 2 3
				pst.setString(1,member.getM_CODE());
				pst.setString(2,member.getM_NAME());
				pst.setString(3,member.getM_ID());
				pst.setString(4,member.getM_TEL());
				pst.setString(5,member.getM_BIRTHDAY());
				
				
				//insert쿼리 실행해주세요
				pst.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//변경하기
		public void update(String code, String id, String newname, String newtel, String newbirth, String newl_rental) {
			//데베연결
			Connection con = getConnection();
			String sql = "update lib_member set m_name=?, m_tel=?, m_birthday=?, m_rental_left=? where m_code=?"; 
										///값이 들어가는 자리에는 ? 물음표
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, newname); //왼쪽 물음표부터 채워야함 위에 sql문
				pst.setString(2, newtel);
				pst.setString(3, newbirth);
				pst.setString(4, newl_rental);
				pst.setString(5, code);
				
				pst.executeUpdate(); //등록, 변경, 삭제
				
				pst.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
							
		}
		
		//삭제하기
		public void delete(String code) {
			
			Connection con = getConnection();
		
			String sql = "delete from lib_member where m_code = ?";
			
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, code);
				pst.executeUpdate();
				
				pst.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	
	public static void main(String[] args) throws SQLException {
		
		Lib_MemberDAO m = new Lib_MemberDAO();
		ArrayList<Member> list = m.selectAll();
		
		System.out.println(list);
		
	}
	
	
	
	

	
	
}

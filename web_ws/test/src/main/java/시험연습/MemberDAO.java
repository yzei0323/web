package 시험연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	//연결정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	// 데이터베이스 연결 매서드
	Connection getConnection() {
		Connection con = null;
		//
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
			
	
	//전체조회
	public ArrayList<Member> selectAll(){
		
		ArrayList<Member> list = new ArrayList<>();
	
		//데이터 연결하기
		Connection con = getConnection();
		///sql문 작성
		String sql = "select * from member_tbl_11";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				//쿼리결과 한 행씩 추가
				String m_id = rs.getString(1);
				String m_pw = rs.getString(2);
				String m_name = rs.getString(3);
				
				//어디서 뭐 가져올지... 지정해주는 것 같은...??
				Member member = new Member(m_id, m_pw, m_name);
				list.add(member);
			}
			
			pst.close();
			rs.close();
			con.close(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
			
			
}

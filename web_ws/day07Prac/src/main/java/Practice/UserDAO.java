package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {

	
	//연결정보
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	
	//데이터베이스 연결 매서드
	Connection getConnection(){
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
	
	

	//등록하기
	public void insertUser(User user) {
		//데베연결
		Connection con = getConnection();
		String sql = "insert into post_user(id, pw, nick) values(?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			//왼쪽 물음표부터 채운다 1 2 3
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			pst.setString(3, user.getName());
			
			//insert쿼리 실행해주세요
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	//사용자 인증 매서드
	public boolean validateUser(String id, String pw) {
		boolean isValid = false;
		
		Connection con = getConnection();
		String sql = "select * from post_user where id=? and pw=?";
		
		
		try {
				PreparedStatement pst = con.prepareStatement(sql); 
				
				pst.setString(1, id);
				pst.setString(2, pw);
				
	            ResultSet rs = pst.executeQuery();
	            isValid = rs.next(); // 결과가 있으면 true 반환
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return isValid;
	    }


	}

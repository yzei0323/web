package 시험연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO4 {

	
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
	
	
	public ArrayList<Acorn4> selectAll(){
		
		ArrayList<Acorn4> list = new ArrayList<>();
		
		//데베연결
		Connection con = getConnection();
		///sql
		String sql = "select * from acorntbl2";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				Acorn4 acorn = new Acorn4(id, pw, name);
				list.add(acorn);
				
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

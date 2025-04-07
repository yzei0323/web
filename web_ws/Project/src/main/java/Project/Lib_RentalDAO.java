package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Lib_RentalDAO {

	
	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:testdb";
    String user = "scott";
    String password = "tiger";

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
		public ArrayList<Rental> selectAll() {
			
			ArrayList<Rental> list = new ArrayList<>();
			
			Connection con = getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String sql = "select * from LIB_BOOK_RENTAL";
			
			try {
		
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					String rental_id = rs.getString(1);
					String member_id = rs.getString(2);
					String book_id = rs.getString(3);
					String rental_date = rs.getString(4);
					String return_date = rs.getString(5);
					String return_status = rs.getString(6);
					
					Rental r = new Rental(rental_id, member_id, book_id, rental_date, return_date, return_status);
					list.add(r);
				}
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			return list;
		}
	    
	}


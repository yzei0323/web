package Project;

import java.sql.*;
import java.util.ArrayList;

public class Lib_BookDAO {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:testdb";
    String user = "scott";
    String password = "tiger";

    public Connection BookInfo() throws SQLException {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("DB 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle 드라이버 로드 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
            throw e;  // 예외를 던져서 상위 메서드에서 처리할 수 있도록 함
        }
        return con;
    }
  

    public ArrayList<Book> selectAll() {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM LIB_BOOK_INFO";

        try (Connection con = BookInfo();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String b_id = rs.getString(1);
                String b_title = rs.getString(2);
                String b_author = rs.getString(3);
                String b_publisher = rs.getString(4);
                String b_rental_status = rs.getString(5);
                String b_img = rs.getString(6);

                Book b = new Book(b_id, b_title, b_author, b_publisher, b_rental_status, b_img);
                list.add(b);
            }
        } catch (SQLException e) {
            System.out.println("데이터 조회 중 오류 발생");
            e.printStackTrace();
        }
        
    	    return list;
    }
    
 
	public ArrayList<Book> searchTitle(String search) throws SQLException {
		ArrayList<Book> list = new ArrayList<Book>();
		Connection con = BookInfo();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM LIB_BOOK_INFO WHERE UPPER(REPLACE(TRIM(B_TITLE), ' ', '')) LIKE UPPER(REPLACE(?, ' ', '')) ";
		
		try {
	        con = BookInfo();
	        pst = con.prepareStatement(sql);
	        pst.setString(1, "%" + search.trim() + "%");

	        rs = pst.executeQuery();

	        while (rs.next()) {
	            String b_id = rs.getString(1);
	            String b_title = rs.getString(2);
	            String b_author = rs.getString(3);
	            String b_publisher = rs.getString(4);
	            String b_rental_status = rs.getString(5);
	            String b_img = rs.getString(6);

	            Book b = new Book(b_id, b_title, b_author, b_publisher, b_rental_status, b_img);
	            list.add(b);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pst != null) pst.close();
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		return list;
	}
    
    
}

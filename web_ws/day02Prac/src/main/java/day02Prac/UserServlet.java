package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Testuser")
public class UserServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		
		try {
			Class.forName(driver);
			
			con=DriverManager.getConnection(url,user,password);
			
			String sql="select * from member_tbl_11";
			
			st=con.createStatement();
			
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				out.println(rs.getString(1)+" ");
				out.println(rs.getString(2)+" ");
				out.println(rs.getString(3)+" ");
			}
			
			rs.close();
			st.close();
			con.close(); 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
}

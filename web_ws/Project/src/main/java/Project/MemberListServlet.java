 package Project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/memberList")
public class MemberListServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		Lib_MemberDAO m = new Lib_MemberDAO();
		ArrayList<Member> list = null;
		
		try {
			list = m.selectAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("memberInfo", list);
		
		
		req.getRequestDispatcher("WEB-INF/views/memberList.jsp").forward(req, resp);
		
		
	
	}
	
}

package day08Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/members")
public class MemberListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//모델
		MemberService service = new MemberService();
		ArrayList<Member> list = service.getMembers(); 
		
		
	//모델 저장하기
		req.setAttribute("list", list);
		
	//view 응답
		//req.getRequestDispatcher("WEB-INF/views/listMember.jsp").forward(req, resp);
		req.getRequestDispatcher("WEB-INF/views/listMember2.jsp").forward(req, resp);
		
	}
}

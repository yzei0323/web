package 시험연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/memberListTest")
public class MemberListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//모델(데이터 저장하기)
		MemberService m = new MemberService();
		ArrayList<Member> list = m.getMemberList();
	
		
		//request에 데이터 보내기?? 뭐더라 ㅅㅂ
		req.setAttribute("list", list);
		
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/memberList.jsp").forward(req, resp);
		
	}
}

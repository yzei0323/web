package Project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서비스
//회원id => 회원정보 제공하기

//get
//post(x) get만 할거예용

//컨트롤러 : 서블릿
//모델 : 회원정보 한 개
//뷰view : 회원정보 화면

@WebServlet("/memberOne")
public class MemberOneServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자 정보 가져오기 (쿼리스트링 ?m_code= )
		//
		String code = req.getParameter("m_code");
		System.out.println(code);
		
		
		//모델
		MemberService s = new MemberService();
		Member member= s.getMemberInfo(code);
		
		//
		req.setAttribute("member", member);
		
		
		//응답
		req.getRequestDispatcher("WEB-INF/views/memberInfo.jsp").forward(req, resp);
	}
}

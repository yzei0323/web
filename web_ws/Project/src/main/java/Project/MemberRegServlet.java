package Project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//회원등록서비스
//get : 회원화면 보여주기, a태그 링크로 요청하면 get으로 인식
//post : 회원정보를 가져와서 데이터베이스 등록하기


@WebServlet("/regMember")
public class MemberRegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		//
		req.getRequestDispatcher("WEB-INF/views/joinForm.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		//한글설정하기
		req.setCharacterEncoding("utf-8");
		
		//회원정보 가져오기 
		///form에 있는 name으로 가져와야 한다!!
		String code = req.getParameter("m_CODE");
		String name = req.getParameter("m_NAME");
		String id = req.getParameter("m_ID");
		String tel = req.getParameter("m_TEL");
		String birth = req.getParameter("m_BIRTHDAY");
		String l_rental = req.getParameter("m_RENTAL_LEFT");
		
		
		System.out.println(code);
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
		System.out.println(birth);
		System.out.println(l_rental);
		
	
		//
		Member member = new Member(code, name, id, tel, birth, l_rental);
		System.out.println(member);
		
		//서비스
		//모델 -> 데이터베이스에 등록하기
		MemberService s = new MemberService();
		s.registerMember(member);
		
		//응답
		req.getRequestDispatcher("WEB-INF/views/joinOk.jsp").forward(req,resp);
	}
}

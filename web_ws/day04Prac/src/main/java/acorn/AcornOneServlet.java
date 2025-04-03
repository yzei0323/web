package acorn;

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

@WebServlet("/acornOne")
public class AcornOneServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자 정보 가져오기 (쿼리스트링 ?id= )
		//
		String id = req.getParameter("id");
		System.out.println(id);
		
		
		//모델
		///id에 대한 회원정보 가져오기
		AcornService s = new AcornService();
		Acorn acorn = s.getMemberInfo(id);
		
		//
		req.setAttribute("acorn", acorn);
		
		
		//응답
		req.getRequestDispatcher("WEB-INF/views/acornInfo.jsp").forward(req, resp);
	}
}

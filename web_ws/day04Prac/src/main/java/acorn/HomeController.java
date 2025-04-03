package acorn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//메인페이지를 제공하는 서비스

//컨트롤러 : 컨트롤러
//뷰 : 메인화면

@WebServlet("/Home")
public class HomeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/views/home.jsp").forward(req, resp);
		
		//브라우저에게 재요청하라는 명령   "/day04Prac/acornList" 매핑된 서비스가 다시 요청됨
		//이걸 여기다가 쓰는게 맞는지 모르겟어염 resp.sendRedirect("/day04Prac/acornList");
	}
	
	
}

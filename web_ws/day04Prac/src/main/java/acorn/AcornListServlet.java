package acorn;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//회원정보 조회하기 서비스

//get
//post(x)

//컨트롤러 : 서블릿
//모델 : 자바 - service, dao
//뷰 jsp

@WebServlet("/acornList")
public class AcornListServlet extends HttpServlet {

	
	//get
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//
		
		//데이터만들기(모델)
		AcornService s = new AcornService();
		ArrayList<Acorn> list = s.getMemberList();
		
		System.out.println(list); //확인해보긩
		
		//request 데이터 저장하기
		req.setAttribute("list", list); ///엉뚱한 데이터 저장하지 않도록하세욧
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/acornList.jsp").forward(req, resp);
		
		
	}
	
}

package day07Prac.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//로그인한 회원만 이 서비스를 제공하려고 한다 !!
		//로그인한 회원 => 주문정보를 응답
		//로그인 안한 회원 => 로그인서비스가 요청될 수 있도록 sendRedirect 사용
		
		//세션에 저장한 로그인 정보 얻어와서 로그인 여부를 확인할 수 있다
		
		HttpSession session = req.getSession();
		String loginId = (String)session.getAttribute("loginId");
		
		if(loginId != null) {
			
			//모델 () 주문정보
			
			//모델 얻어오기
			//모델 저장하기
			
			String item = "티셔츠 25000원";
		
			req.setAttribute("item", item);
			
			req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
		
		}else {
			
			//로그인되지 않으면 로그인을 요청할 수 있도록 redirect 사용하기
			resp.sendRedirect("/day07Prac/main");
		}
		
		
		
		
		
	}
}

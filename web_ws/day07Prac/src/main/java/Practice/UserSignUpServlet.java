package Practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//회원등록서비스
//get : 회원화면 보여주기, a태그 링크로 요청하면 get으로 인식
//post : 회원정보를 가져와서 데이터베이스 등록하기


@WebServlet("/signUp2")
public class UserSignUpServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		//
		req.getRequestDispatcher("WEB-INF/views/signupForm.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		//한글설정하기
		req.setCharacterEncoding("utf-8");
		
		//회원정보 가져오기 
		///form에 있는 name으로 가져와야 한다!!
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String nick = req.getParameter("nick");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(nick);
	
		//
		User user = new User(id, pw, nick);
		System.out.println(user);
		
		//서비스
		//모델 -> 데이터베이스에 등록하기
		UserService u = new UserService();
		u.signUpUser(user);
		
		//응답
		req.getRequestDispatcher("WEB-INF/views/main.jsp").forward(req,resp);
	}
}

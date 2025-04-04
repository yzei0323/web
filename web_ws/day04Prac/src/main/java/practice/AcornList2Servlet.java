package practice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornList2")
public class AcornList2Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//데이터만들기
		AcornService2 s = new AcornService2();
		ArrayList<Acorn2> list = s.getMemberList();
		
		
		//request 데이터 저장
		request.setAttribute("이름아무거나해도된대", list);
		///대신 데이터 꺼낼때도 이 이름으로 꺼내야됨 몬말알?? 
		
		//응답
		request.getRequestDispatcher("WEB-INF/views/acornList2.jsp").forward(request, response);
	
	}
	
	
}

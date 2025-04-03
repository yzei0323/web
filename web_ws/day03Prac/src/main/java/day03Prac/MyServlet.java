package day03Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class MyServlet extends HttpServlet {

	//부모의 서비스는 요청방법GET, POST냐에 따라 doGet() 호출하거나 doPost() 호출한다
	
	
	//url직접 호출
	//a태그로 호출하면 => Get요청으로 인식됨
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Get!!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("");
	}
	
}

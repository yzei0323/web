package day03Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/divisorMVC")
public class DivisorController extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//요청 정보 꺼내기
		String su_=request.getParameter("su");
		int su = Integer.parseInt(su_); //12
		
		
		//모델만들기(데이터만들기)
		DivisorService service= new DivisorService();
		ArrayList<Integer> list = service.getDivisor(su);
		
		System.out.println(list);
		
		//응답하기
		request.setAttribute("divisor", list);
		
		request.getRequestDispatcher("WEB-INF/views/divisorView.jsp").forward(request, response);
		
	}
	
}

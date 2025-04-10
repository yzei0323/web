package 시험연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listTest3")
public class AcornListServlet3 extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		//모델(데이터 만들기)
		AcornService3 a3 = new AcornService3();
		ArrayList<Acorn3> list = a3.getAcornList();
		
		System.out.println(list);
		
		
		//request 데이터 저장하기
		req.setAttribute("list3", list);
		 
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/listView3.jsp").forward(req, resp);
		
	}
}

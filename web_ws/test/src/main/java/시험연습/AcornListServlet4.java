package 시험연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listTest4")
public class AcornListServlet4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//모델 (데이터만들기)
		AcornService4 a4 = new AcornService4();
		ArrayList<Acorn4> list = a4.getMemberList();
		
		System.out.println(list);
		
		//request 데이터 저장
		req.setAttribute("list", list);
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/listView4.jsp").forward(req, resp);
	
	
	}
}

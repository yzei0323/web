package 시험연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listTest2")
public class AcornListServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//모델(데이터 가져오기??)
		AcornService2 a2 = new AcornService2();
		ArrayList<Acorn2> list = a2.getMemberList2();
		
		System.out.println(list);
		
		//데이터 저장하기 request
		req.setAttribute("acornList", list);
	
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/listView2.jsp").forward(req, resp);
		
	}
	
}

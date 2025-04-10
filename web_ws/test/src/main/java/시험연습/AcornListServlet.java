package 시험연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listTest")
public class AcornListServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
		//모델(데이터만들기)
		AcornService a = new AcornService();
		ArrayList<Acorn> list = a.getMemberList();
		
		System.out.println(list);
		
		
		//request 데이터 저장하기
		req.setAttribute("memberList", list);
		
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/listView.jsp").forward(req, resp);
		
	
	}
	
	
}

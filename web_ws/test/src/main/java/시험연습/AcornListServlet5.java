package 시험연습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listTest5")
public class AcornListServlet5 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//모델(데이터 만들기)
		AcornService5 a5 = new AcornService5();
		ArrayList<Acorn5> list = a5.getMemberList();
		
		System.out.println(list);
		
		//데이터 저장
		req.setAttribute("list", list);
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/listView5.jsp").forward(req, resp);
		

	}
}

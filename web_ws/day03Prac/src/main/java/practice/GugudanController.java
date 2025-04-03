package practice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudanMVC")
public class GugudanController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//요청정보 꺼내기
		String su_ = req.getParameter("su");
		int su = Integer.parseInt(su_);
	
		//모델만들기(데이터만들기)
		GugudanService service = new GugudanService();
		ArrayList<String> list = service.getGugudan(su);
		
		System.out.println(list);
		
		//응답하기
		req.setAttribute("gugudan", list);
		req.getRequestDispatcher("WEB-INF/views/gugudanView.jsp").forward(req, resp);
		
		
	}
}

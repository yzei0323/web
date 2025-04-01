package day01실습;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiplicationTable")
public class 구구단원하는단 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String dan_ = request.getParameter("dan");
		int dan = Integer.parseInt(dan_);
		
		//int dan = Interger.paseInt(reauest.getParameter("dan")); 한번에 해결하기

		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("h2{margin:0;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>3. 원하는 단 제공하기</h1>");

		for (int i = 1; i <= 9; i++) {
			out.println("<h2>"+dan+" × "+i+" = "+dan*i+"<br>"+"</h2>");
		}
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}

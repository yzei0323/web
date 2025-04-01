package day01실습;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiplicationTable3")
public class 구구단3단 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("h2{margin:0;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>2. 3단 제공하기</h1>");

		for (int i = 1; i <= 9; i++) {
			out.println("<h2>"+3+" × "+i+" = "+3*i+"<br>"+"</h2>");
		}
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}

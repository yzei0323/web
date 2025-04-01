package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//영화정보 응답하는 서블릿
//String name; String runningtime; String actor;

@WebServlet("/servlet1")
public class MovieinfoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");

		//
		Movie m = new Movie("베테랑2", "118분", "황정민");
		PrintWriter out = response.getWriter();
	
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("table,td{border: 1px solid black;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>영화이름</td>");
		out.println("<td>러닝타임</td>");
		out.println("<td>주연배우</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>"+m.getName()+"</td>");
		out.println("<td>"+m.getRunningtime()+"</td>");
		out.println("<td>"+m.getActor()+"</td>");
		out.println("</tr>");
		
		
		out.println("</body>");
		out.println("</html>");
	
	
	}
}

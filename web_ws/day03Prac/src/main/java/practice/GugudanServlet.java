package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자 정보, 수 가져오기
		String su_ = req.getParameter("su");
		int su = Integer.parseInt(su_);
		
		//구구단구하기
		ArrayList<String> list = new ArrayList<>();
		for(int i=1; i<=9; i++) {
			list.add(su+" × "+i+" = "+su*i);
		}
		
		//응답
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		out.println(list.toString());
		
		out.println("</body>");
		out.println("</html>");
		
	}
}

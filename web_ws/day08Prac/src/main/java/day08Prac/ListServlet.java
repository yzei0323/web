package day08Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//list?p=2;
		String page = req.getParameter("p");
		
		int currentPage =1;
		if(page != null) {
			currentPage = Integer.parseInt(page);
		}
		
		//
		int pageSize=2;
		int grpSize=5;
		
		MemberService s = new MemberService();
		ArrayList<Member> list = s.getListPage(currentPage);
		
		int totRecords = s.getTotal();
		
		//public PageHandler(int pageSize, int grpSize, int totRecords, int currentPage) { 
		PageHandler handler = new PageHandler(pageSize, grpSize, totRecords, currentPage);
		
		
		//모델(리스트, 페이징정보)
		req.setAttribute("list", list);
		req.setAttribute("paging", handler);
		
		req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req, resp);
	}

}

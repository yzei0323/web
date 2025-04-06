package Project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/search")
public class SearchServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	String search = req.getParameter("search");
    	
    	Lib_BookDAO b = new Lib_BookDAO();
        ArrayList<Book> list = null;

        try {
            list = b.searchTitle(search);
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("bookinfo", list);
        req.getRequestDispatcher("/WEB-INF/views/bookSearch.jsp").forward(req, resp);
        
        
        System.out.println("검색어: " + search);
        System.out.println("검색 결과 개수: " + (list != null ? list.size() : "null"));

        
        
	}
}

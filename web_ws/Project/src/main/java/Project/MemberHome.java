package Project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//메인페이지를 제공하는 서비스

//컨트롤러 : 컨트롤러
//뷰 : 메인화면

@WebServlet("/memberHome")
public class MemberHome extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	
    	Lib_BookDAO b = new Lib_BookDAO();
        ArrayList<Book> list = null;

        try {
            list = b.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("bookinfo", list);
        req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
	
	}
	
	
}

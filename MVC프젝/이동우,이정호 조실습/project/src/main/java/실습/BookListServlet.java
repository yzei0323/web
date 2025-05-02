package 실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookList")
public class BookListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookService service = new BookService();
		ArrayList<Book> list = service.getBookList();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/bookList.jsp").forward(req, resp);
	}
}

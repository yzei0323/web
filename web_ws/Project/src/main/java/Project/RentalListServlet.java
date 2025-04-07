package Project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rentalList")
public class RentalListServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		Lib_RentalDAO r = new Lib_RentalDAO();
		ArrayList<Rental> list = null;
		
		try {
			list = r.selectAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("rentalInfo", list);
		
		
		req.getRequestDispatcher("WEB-INF/views/rentalList.jsp").forward(req, resp);
		
		
	
	}
	
}
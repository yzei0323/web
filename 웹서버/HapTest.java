 import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

 
public class HapTest extends HttpServlet{ 
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		 System.out.println(" hello servlet");
		 
	 
		 
		 resp.setCharacterEncoding("utf-8");            
		 resp.setContentType("text/html;charset=utf-8");   
		 
	  
		 PrintWriter out  =  resp.getWriter();
                 
		 // Date currentDate = new Date();
                 int sum = 0;
                 for(int i=1; i<=10; i++){		
			sum = sum+i;
		 }

		 out.println( sum  +  " hap  ^_________________^ ");
		
	}

}

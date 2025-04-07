package Project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//회원 삭제하는 서비스

//컨트롤러 : 서블릿 get
//모델 : 테이터베이스 회원 삭제
//뷰 : 삭제되었다 뷰

@WebServlet("/memberDelete")
public class MemberDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자 정의
		//쿼리스트링 ?m_code=
		String code = req.getParameter("m_code");
		
		//모델
		MemberService s = new MemberService();
		s.deleteMember(code);
		
		req.getRequestDispatcher("WEB-INF/views/deleteOk.jsp").forward(req, resp);
		
	}
}

package Project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//회원정보 변경하기
//컨트롤러 : servlet
//모델 : 데이터베이스에 변경하기
//뷰 : 변경성공 페이지 응답

@WebServlet("/updateMember")
public class MemberUpdateServlet extends HttpServlet{

	//등록이나 변경이나 많은 데이터를.. 뭐? 아무튼 그럴때는 post를 이용합니다
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//한글인코딩
		req.setCharacterEncoding("utf-8");
		
		//사용자 정보 가져오기
		String code = req.getParameter("m_CODE");
		String name = req.getParameter("m_NAME");
		String id = req.getParameter("m_ID");
		String tel = req.getParameter("m_TEL");
		String birth = req.getParameter("m_BIRTHDAY");
		String l_rental = req.getParameter("m_RENTAL_LEFT");
		
		System.out.println(code);
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
		System.out.println(birth);
		System.out.println(l_rental);
		
		
		//회원정보 변경하기 서비스
		MemberService s = new MemberService();
		s.modifyMember(code, name, id, tel, birth, l_rental);	
		
		
		//응답
		///변경 완료 뷰 응답
		req.getRequestDispatcher("WEB-INF/views/updateOk.jsp").forward(req, resp);
	}
}

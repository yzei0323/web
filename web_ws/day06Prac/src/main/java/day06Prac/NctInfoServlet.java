package day06Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

//진짜 가지가지한다 이제 하다하다 엔시티를 출력을
//그래 할 때 됐지 함 해볼게용용 용~~~
@WebServlet("/nctInfo")
public class NctInfoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//한글 인코딩
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");
		
		//모델(런쥔이 정보>3< 앙~~ 나의 말랑야웅이~~~)
		Nct nct = new Nct("황인준", "0323");
		
		//json형태의 데이터로 응답
		//자바를 json형식으로
		JSONObject o = new JSONObject();
		o.put("name", nct.getName());
		o.put("birthday", nct.getBirthday());
		
		
		resp.getWriter().print(o); //nct.toString();
	
		
	
	}

}
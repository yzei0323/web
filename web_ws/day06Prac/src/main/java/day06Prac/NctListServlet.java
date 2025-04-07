package day06Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/nctList")
public class NctListServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		///한글인코딩
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");
				
		ArrayList<Nct> list = new ArrayList<>();
		list.add(new Nct("이민형","0802"));
		list.add(new Nct("황인준","0323"));
		list.add(new Nct("이제노","0423"));
		
		
		//json변환
		JSONArray arr = new JSONArray();
		for(int i=0; i<list.size(); i++) {
			Nct nct = list.get(i);
			JSONObject nctO = new JSONObject();
			nctO.put("name", nct.getName());
			nctO.put("birthday", nct.getBirthday());
			
			arr.put(nctO);
			
		}
		
		//응답하기
		resp.getWriter().println(arr);
	}

}

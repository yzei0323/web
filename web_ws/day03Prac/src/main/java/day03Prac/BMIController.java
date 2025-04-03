package day03Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//bmi 계산에 대한 응답하는 서비스
//서블릿 - service
//     - doGet, doPost

//bmi 계산 화면을 제공
//bmi 계산한 결과를 제공하는 것
@WebServlet("/bmiService")
public class BMIController extends HttpServlet {
	
	//사용자가 요청하는 방법에 따라 doGet이 호출되거나 doPost가 호출될 수 있다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/views/bmiForm.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String height_ = req.getParameter("height");
		double height = Double.parseDouble(height_);
		
		String weight_ = req.getParameter("weight");
		double weight = Double.parseDouble(weight_);
		
		System.out.println(height);
		System.out.println(weight);
		
		//응답
		String result = "정상체중";
		
		//저장
		req.setAttribute("result", result);
		
		//응답 view로 포워드
		req.getRequestDispatcher("WEB-INF/view/bmiResult.jsp").forward(req, resp);
		
		
	}
}

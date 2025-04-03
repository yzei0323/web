package day04Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 영화정보 서비스 만들기
// => 서블릿 한 개로 만들어서 응답할 수 있다

//get, post => 서버가 단순히 제공하는 서비스 => GET (a태그(링크)), 
//			   서버가 등록이나 변경하는 서비스 => POST (form태그)
// 서블릿 (controller)
// 모델 (MovieService, MovieDAO, Movie)
// 뷰 (MovieList.jsp)

@WebServlet("/movieAll")
public class MovieController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//영화정보 데이터
		//MovieService 서비스 클래스
		
		//MovieService s = new MovieService();
		MovieService2 s = new MovieService2();
		ArrayList<Movie>list = s.getMovieList();
		
		//request저장소 데이터 저장하기
		
		req.setAttribute("list", list);
		
		
		
		
		//웹페이지형식의 응답
		//jsp로 포워드
		req.getRequestDispatcher("WEB-INF/views/movieList.jsp").forward(req, resp);
		
		
	}
}

package Practice;

import java.util.ArrayList;

//

public class UserService {

	UserDAO dao = new UserDAO();
	
	//회원가입 회원정보등록
	public void signUpUser(User user) {
		
		//
		dao.insertUser(user);
	
	}

	
}

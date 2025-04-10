package 시험연습;

import java.util.ArrayList;

public class MemberService {

	MemberDAO dao = new MemberDAO();
	
	public ArrayList<Member> getMemberList(){
		
		ArrayList<Member> list = dao.selectAll();
		
		return list;
	}
	
}

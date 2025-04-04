package Project;

import java.util.ArrayList;

//

public class MemberService {

	Lib_MemberDAO dao = new Lib_MemberDAO();
	
	//회원정보 등록하기
	public void registerMember(Member member) {
		
		//
		dao.insert(member);
	
	}
	
	
	//전체조회
	public ArrayList<Member> getMemberList(){
		
		ArrayList<Member> list = dao.selectAll(); //전체 다 가져오기
	
		return list;
	}
	
	
	
	//한개조회
	public Member getMemberInfo(String id) {
		
		Member member = dao.selectOne(id); 

		return member;
	}
	
	
	//회원정보 변경하기
	public void modifyMember(String code, String name, String id, String tel, String birth, String left_rental) {
		
		dao.update(code, name, id, tel, birth, left_rental);
	}
	
	
	//회원정보 삭제하기
	public void deleteMember(String id) {
		
		dao.delete(id);
	}
	
}

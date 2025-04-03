package acorn;

import java.util.ArrayList;

//

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
	//회원정보 등록하기
	public void registerMember(Acorn acorn) {
		
		//
		dao.insertMember(acorn);
	
	}
	
	
	//
	public ArrayList<Acorn> getMemberList(){
		
		ArrayList<Acorn> list = dao.selectAll(); //전체 다 가져오기
	
		return list;
	}
	
	
	
	//
	public Acorn getMemberInfo(String id) {
		
		Acorn acorn = dao.selectOne(id); 

		return acorn;
	}
	
	
	//회원정보 변경하기
	public void modifyMember(String id, String pw) {
		
		dao.update(id, pw);
	}
	
	
	//회원정보 삭제하기
	public void deleteMember(String id) {
		
		dao.delete(id);
	}
	
}

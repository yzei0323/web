package 시험연습;

import java.util.ArrayList;

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
	
	public ArrayList<Acorn> getMemberList() {
	
		ArrayList<Acorn> list = dao.selectAll();	
		
		return list;
		
	}
}

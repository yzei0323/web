package 시험연습;

import java.util.ArrayList;

public class AcornService4 {

	
	AcornDAO4 dao = new AcornDAO4();
	
	public ArrayList<Acorn4> getMemberList(){
		
		ArrayList<Acorn4> list = dao.selectAll();
		
		return list;
	}
	
}

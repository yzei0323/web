package 시험연습;

import java.util.ArrayList;

public class AcornService5 {

	AcornDAO5 dao = new AcornDAO5();
	
	public ArrayList<Acorn5> getMemberList(){
		
		ArrayList<Acorn5> list = dao.selectAll();
		
		return list;
	}
}

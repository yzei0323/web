package 시험연습;

import java.util.ArrayList;

public class AcornService2 {

	AcornDAO2 dao2 = new AcornDAO2();
	
	
	public ArrayList<Acorn2> getMemberList2(){
		
		ArrayList<Acorn2> list = dao2.selectAll();
		
		return list;
	}
	
	
}

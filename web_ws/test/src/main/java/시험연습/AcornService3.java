package 시험연습;

import java.util.ArrayList;

public class AcornService3 {
	
	AcornDAO3 dao = new AcornDAO3();
	
	public ArrayList<Acorn3> getAcornList(){
		
		ArrayList<Acorn3> list = dao.selectAll();
		
		return list;
	}

}

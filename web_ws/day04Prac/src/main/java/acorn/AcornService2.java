package acorn;

import java.util.ArrayList;

public class AcornService2 {


	AcornDAO dao = new AcornDAO(); 
	
	public ArrayList<Acorn> getMemberList(){
		
		ArrayList<Acorn> list = dao.selectAll();
		
		return list;
	}
	
	

}

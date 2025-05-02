package examPrj;

import java.util.ArrayList;

public class ActorService {

	ActorDAO dao = new ActorDAO();
	
	public ArrayList<Actor> actorList(){
		
		ArrayList<Actor> list = dao.selectAll();
		
		return list;
	}
}

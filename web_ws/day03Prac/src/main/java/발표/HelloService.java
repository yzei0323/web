package 발표;

import java.util.ArrayList;

public class HelloService {
	
	public String getHello(){
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=1; i<=5; i++) {
			list.add("안녕~v(^o^)v");
		}
		return list.toString();
	}
}

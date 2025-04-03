package practice;

import java.util.ArrayList;

public class GugudanService {
	
	public ArrayList<String> getGugudan(int su){
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=1; i<=9; i++) {
			list.add(su+" × "+i+" = "+su*i);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		GugudanService s = new GugudanService();
		ArrayList<String> list = s.getGugudan(6);
		
		for(int i=0; i<=9; i++) {
			System.out.println(list.get(i));
		}
		
		for(String su : list) {
			System.out.println(su);
		}
	
	}

}

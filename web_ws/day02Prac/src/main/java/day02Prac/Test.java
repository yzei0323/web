package day02Prac;

public class Test {

	public static void main(String[] args) {
		Movie m = new Movie("베테랑2", "118분", "황정민");
		
		System.out.println(m);
		System.out.println(m.toString()); //toString()메서드 호출됨, 생략가능한 메서드
	
		System.out.println(m.getActor());
		System.out.println(m.getName());
		System.out.println(m.getRunningtime());

		
	}
}

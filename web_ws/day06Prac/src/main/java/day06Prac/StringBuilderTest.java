package day06Prac;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		
		//String => 불변객체
		
		String str = "hello";
		str += "servlet";
		str += "!!";
		str += "^^";
		System.out.println(str);
		
		//문자열을 많이 추가할 때는 => String 대신에 StringBuilder 사용함 (성능좋음)
		
		//둘이 내부 동작이 다르대

		//문자열 수정이 가능하다, 스트링빌더는 내부적으로 문자열 배열을 가진대 (특정크기로 만들어진대)
		//012345678910111213
		//helloservlet!!^^
		StringBuilder strb = new StringBuilder();
		strb.append("hello");  
		strb.append("servlet");
		strb.append("!!");
		strb.append("^^");
		System.out.println(strb.toString());
		
		//append를 쓸 때 새로 들어가는게 아니라 뒤로 붙는거래
	    //문자열 새로 생성하는거보다는 뒤에 툭툭 붙는게 더 효율적이니깐 ㅎㅎ
	}

}

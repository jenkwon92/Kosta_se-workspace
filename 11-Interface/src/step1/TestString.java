package step1;

public class TestString {
	public static void main(String[] args) {
		String name1="아이유";
		//문자열을 만드는 방법은 다양, 아래와 같이 만들수도 있음
		String name2 = new String("아이유");
		System.out.println(name1+" "+name2);
		System.out.println(name1 == name2); //문자열 비교시 == 연산자는 사용하지 않는다 
		System.out.println(name1.equals(name2));
	}
}

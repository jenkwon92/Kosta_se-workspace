package step2;
/*
 -java data type : primitive data type, reference data type
	자바의 데이터 타입에는 기본형 데이터 타입(primitive data type) 과 참조형 (reference data type)이 있다
	1> primitive data type
                    1 byte		2byte		4byte		8byte
        정수형		byte			short			int				long		정수형의 기본형은 int형
 		실수형										float			double	실수형의 기본형은 double 형
 		문자형						char										문자형은 오직 한 문자만 가능. 문자열은 참조형인 String을 사용
 		논리형		boolean													논리형은 true or false 만 가능
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//1. 정수형
		byte b = 1;
		b = 2;
		System.out.println("byte : "+b);
		//java se api를 이용해 byte 타입의 최대값, 최소값을 확인해본다
		System.out.println("byte 형 최대값 : "+Byte.MAX_VALUE);
		System.out.println("byte 형 최소값 : "+Byte.MIN_VALUE);
		//b = 129; //error : byte 최대값을 넘으므로
		
		short s = 3; //2byte
		System.out.println("short : "+s);
		
		int i = 1; //4byte 정수형의 기본형은 int
		System.out.println("int : "+i);
		
		long l = 3L; //8byte long형 데이터에는 대문자 or 소문자 l을 붙인다. (안붙일 경우 int형으로 인식)
		System.out.println("long : "+l);
		
		
		//2. 실수형
		float f = 3.14f; //4byte float형 데이터에는 대문자 or소문자 f를 붙인다 (안붙일 경우 double로 인식)
		System.out.println("float : "+f);
		
		double d = 3.14;  //8byte, 실수형의 기본형은 double
		System.out.println("double : "+d);
		
		//3. 문자형 (한 문자만 가능, 문자열은 참조형 String으로 제어)
		char c = 'a';
		System.out.println("char : "+c);
		
		// 4. 논리형 (true or false만 가능)
		boolean bo = true;
		bo = false;
		System.out.println("boolean : "+ bo);
		
		//type casting 사례
		byte b1 = 1;
		byte b2 = 6;
		//아래는 compile error
		//byte b3 = b1+b2; //연산 결과는 7은 정수형의 기본형인 int로 인식
		//방법 1
		// int in = b1+b2;
		
		//방법 2
		byte b3 = (byte)(b1+b2); //두 숫자의 연산결과가 byte형으로 인식시킨다 ->type casting
		System.out.println("연산결과 : "+b3);
	}
}

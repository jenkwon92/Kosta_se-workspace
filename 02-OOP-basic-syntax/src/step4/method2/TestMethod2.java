package step4.method2;

public class TestMethod2 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.plus(2,2); //전달인자 (argument) 2개를 메서드 호출시 전달
		System.out.println("연산 결과는 : "+result);
		System.out.println("연산 결과2 : " +c.plus(3, 5));
		
		int num1 = 7;
		int num2 = 5;
		result = c.minus(num1,num2);
		System.out.println("연산 결과3 : "+result);
	}
}

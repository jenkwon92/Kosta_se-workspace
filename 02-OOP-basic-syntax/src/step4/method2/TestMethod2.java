package step4.method2;

public class TestMethod2 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.plus(2,2); //�������� (argument) 2���� �޼��� ȣ��� ����
		System.out.println("���� ����� : "+result);
		System.out.println("���� ���2 : " +c.plus(3, 5));
		
		int num1 = 7;
		int num2 = 5;
		result = c.minus(num1,num2);
		System.out.println("���� ���3 : "+result);
	}
}
package step7;

public class TestConstructor2 {
	public static void main(String[] args) {
		String info="아이유 개인정보"; // 지역변수 local variable
		CreditCard card=new CreditCard(info);
		System.out.println(card.getInfo());
	}
}

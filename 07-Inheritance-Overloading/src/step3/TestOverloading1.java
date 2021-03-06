package step3;
// 코드를 한 눈에 확인하기 위해 하나의 파일에 클래스를 여러개 정의한다
// 학습용인 (실제 개발시에는 별도의 파일에서 클래스 정의하는 것을 권장)
class Person{
	public void eat() {
		System.out.println("먹다");
	}
	
	//메서드 오버로딩 : method overloading ->  동일한 메서드명으로 다양한 매개변수 parameter 를 정의
	public void eat(int count) {
		System.out.println(count+ "인분 먹다");
	}
	//public void eat(int kkk) {} //error 변수명이 다르다고 해서 오버로딩이 되는 것은 아니다. 매개변수의 타입. 갯수, 순서가 달라야 오버로딩이 성립
	//메서드 오버로딩
	public void eat(String menu) {
		System.out.println(menu+"먹다");
	}
	
	//메서드 오버로딩
	public void eat(String menu, int count) {
		System.out.println(menu+" "+count+"인분 먹다");
	}
}

//하나의 파일에서 여러 클래스 정의시에는 main이 있는 클래스에 public을 명시하고 파일명 또한 main 이 있는 클래스명으로 한다
public class TestOverloading1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.eat(2);
		p.eat("마라탕");
		p.eat("마라탕", 2);
	}
}

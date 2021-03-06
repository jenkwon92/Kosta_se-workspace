package step12;
/*
 * 여러개의 스레드(멀티 스레드) 는 하나의 객체를 공유해서 사용할 수 있다 -> 장점
 * 아래의 예제는 멀티 스레드가 하나의 객체를 이용해서 생성되고 실행되었을 때 발생할 수 있는
 * 문제점에 대해 확인하는 예제 -> 동기화 처리(synchronized) 의 필요성을 확인
 * 
 * 예) 카페 화장실의 좌석(공유자원)이 하나이고 여러 손님들(멀티 스레드) 이 사용할 떄 발생할 수 있는 문제를 확인
 */
public class TestSynchronizedEx {
	public static void main(String[] args) {
		Toilet toilet = new Toilet(); //공유자원
		Thread t1 = new Thread(toilet, "원빈");
		Thread t2 = new Thread(toilet, "정해인");
		t1.start();
		t2.start();
	}
}

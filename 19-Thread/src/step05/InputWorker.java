package step05;

public class InputWorker implements Runnable {
	@Override
	public void run() { //try-catch 깔끔해보이기 위해 run에서 사용
		try {
			input();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void input() throws InterruptedException { //실질적으로 돌아가는 기능구현
		for (int i = 0; i < 10; i++) {
			System.out.println("서버로부터 메세지를 입력받는 스레드 :" + i);

			Thread.sleep(1000);

		}
	}
}

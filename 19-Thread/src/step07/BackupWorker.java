package step07;

public class BackupWorker implements Runnable {
	@Override
	public void run() {
		while (true) {
			try {
				backup();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void backup() throws InterruptedException {
		Thread.sleep(3000); // 3초간격으로 백업 실행
		System.out.println("백업스레드가 워드문서를 백업처리");
	}
}

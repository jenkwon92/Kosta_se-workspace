package step3;

import java.io.IOException;

public class TestObjectSerialization1 {
	public static void main(String[] args) {
		String path = "C:\\kosta224\\iotest\\account.obj";
		AccountVO avo = new AccountVO("아이유", 200, "starjava");
		AccountService service = new AccountService(path);
		try {
			service.saveObject(avo);
			System.out.println("계좌정보를 직렬화하여 파일에 저장");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

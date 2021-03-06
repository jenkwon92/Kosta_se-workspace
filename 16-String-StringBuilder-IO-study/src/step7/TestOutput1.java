package step7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 출력스트림 테스트 예제
 * 특정 파일을 생성해서 데이터를 출력해보는 예제
 * 
 */
public class TestOutput1 {
	public static void main(String[] args) {
		try {
			//장치에 연결되는 Node Stream 계열을 생성
			FileWriter fw = new FileWriter("C:\\kosta224\\iotest\\memo.txt");
			//기능을 지원하는 Processing Stream 계열을 생성
			PrintWriter pw = new PrintWriter(fw);
			pw.print("쉬는시간입니다");
			System.out.println("파일 생성 및 출력");
			pw.close(); //스트림을 닫아준다(이떄 추가적으로 메모리(buffer)에 있는 데이터를 실제 파일에 출력한다 - flush() 호출)
			//스트림을 close 즉, 닫아준다는 것은 장치에 연결된 정보를 해제함으로써 다른 작업자가 해당 device를 제어할 수 있도록 한다는 의미
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

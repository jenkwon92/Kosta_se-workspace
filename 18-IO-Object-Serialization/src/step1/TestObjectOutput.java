package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//객체 직렬화하여 파일에 객체의 정보를 전송해 저장하는 예제
//전송하려고 하는 객체의 클래스가 java.io.Seializable interface 계층 구조하에 있지 않다면 아래와 같은 Exception이 발생된다
//java.io.NotSerializableException:step1.Person
public class TestObjectOutput {
	public static void main(String[] args) {
		try { 
			//파일에 연결되는 NodeStream
			FileOutputStream fos = new FileOutputStream("C:\\kosta224\\iotest\\person.obj");
			//객체 직렬화 기능을 제공하는 ProcessingStream
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p = new Person("아이유","오리",100);
			oos.writeObject(p);
			oos.close(); //스트림을 닫아줌
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

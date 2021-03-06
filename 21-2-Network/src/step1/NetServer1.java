package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432); // 통신 서버를 구현하기 위한 객체 -대표전화의 역할
		System.out.println("**NetServer1 실행**");
		// ServerSocker의 accept() : 클라이언트 접속을 대기하다가 접속하면 그 클라이언트와 통신할 일반 Socket을 반환
		Socket socket = serverSocket.accept(); // 실제클라이언트와 통신하는 역할 - 전화기가 생성됨
		System.out.println("**client가 접속함**");
		// 서버에서 접속한 클라이언트로 메세지를 출력한다
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("즐거운 목요일 오후입니다"); //데이터를 넘겨준 뒤
		out.close(); //할일이 끝났으니 닫힘
		socket.close();
		serverSocket.close();
		System.out.println("**NetServer1 클라이언트에게 메세지 출력 후 종료**");
	}

	public static void main(String[] args) {
		NetServer1 server = new NetServer1();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package step3.inst;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient3 {
	/*
	 * client는 서버에 접속 (Socket 생성) -Local ip로 연습
	 * 서버로 메세지를 출력(socket.getOutputStream() <PrintWriter println())
	 * out과 socket close
	 */
	public void go() throws UnknownHostException, IOException {
		Socket socket = new Socket(IP.INST, 5432);
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("수고하셨습니다");
		System.out.println("**NetClient3 서버로 메세지 전송**");
		out.close();
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new NetClient3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

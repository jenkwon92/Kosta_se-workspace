package step1; //패키지 선언부, 패키지는 class들을 디렉토리별로 분류하기 위해 사용,패키지명은 소문자로 명시 >안써도 에러가 나지는 않지만, 임의 별로 분류해서 관리하기 위함임
//ex) package org.kosta.cafe.model;
//ex) package org.sprongframework.util;
//class 선언부,  class명은 첫글자는 대문자, 합선어의 첫글자는 대문자, 나머지는 소문자로 명시 ->camel case
public class TestMessage {
	//메인 메서드 : 자바 프로그램의 시작점 -> 메인 메서드가 있어야 실행 가능
	public static void main(String[] args) {
		System.out.println("굿모닝");
	}
}//실행 ctrl+F11

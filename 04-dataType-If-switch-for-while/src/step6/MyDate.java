package step6;

public class MyDate {
	private int month;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		//매개변수가 1~12 사이 일때는 인스턴스 변수에 값을 할당하고
		// 아니면 잘목된 입력값입니다를 출력하고 할당시키지 않는다 
		if(month>=1&&month<=12)
			this.month = month;
		else
			System.out.println(month+"월은 잘못된 입력값입니다.");
	}
	
}

package step4;

public class TestOperator {
	public static void main(String[] args) {
		int i = 7;
		int j = 3;
		 System.out.println(i*j);
		 System.out.println(i/j);
		 System.out.println(i%j); //나머지
		 System.out.println(i=j);//할당 또는 대입
		 System.out.println(i==j);//같으면 true 다르면 false
		 boolean flag = false;
		 System.out.println(flag);//false
		 System.out.println(!flag);//true
		 System.out.println("*****증감연산자******");
		 int k = 7;
		 System.out.println(k++); //실행 후 증가 7
		 System.out.println(k); //증가한 값 8
		 
		 System.out.println("**결과예상***");
		 System.out.println(k--); //8 실행 후 감소 6
 		 System.out.println(--k); //6 감소 후 실행
 		 System.out.println("*****************");
 		 int money = 200;
 		 //위의 money에 100을 더하고자 한다
 		 //money = money+100;
 		 money+=100;
 		 System.out.println(money);
 		 //기존 money에 150을 빼고자 한다 
 		 money-=150;
 		 System.out.println(money);
		 System.out.println("***삼항연산자***");
		 /*
		  * 삼항연산자
		  * (조건식) ? 식1:식2;
		  * 조건식이 참이면 식 1이 실행, 거짓이면 식2 시행
		  */
		 
		 int x=-10;
		 int result=(x>0)? x+1:x+2;
		 System.out.println(result);
	}
}

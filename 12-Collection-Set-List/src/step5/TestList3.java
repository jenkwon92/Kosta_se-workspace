package step5;
// Generic을 적용한 List 의 예
import java.util.ArrayList;

public class TestList3 {
	public static void main(String[] args) {
		ArrayList<FriendDTO> list  = new ArrayList<FriendDTO>();
		list.add(new FriendDTO("아이유", 100));
		list.add(new FriendDTO("박보검", 200));
		list.add(new FriendDTO("강하늘", 50));
		//list.add("ㅎㅎㅎ"); //Generic에 명시된 타입이 아니므로 compile error
		//list 요소 중 index가 1인 요소의 name을 출력
		//Generic 이 적용되었으므로 별도의 casting은 필요없다
		System.out.println(list.get(1).getName());
		
		//for문을 이용해 요소의 getMoney()를 호출해 money를 출력
		//별도의 캐스팅 작업은 필요없다
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getMoney());
		}
	}
}

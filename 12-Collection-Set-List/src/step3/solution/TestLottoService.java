package step3.solution;

import java.util.TreeSet;

public class TestLottoService {
	public static void main(String[] args) {
		LottoService service = new LottoService();
		for (int i = 0; i < 5; i++) {
			TreeSet<Integer> set = service.createLottoNumber();
			System.out.println("대박 로또번호" + set); // treeSet이니 오름차순 정렬
		}
	}
}

package step3;

import step2.Account; //ctrl+shift+o

/*
 * step3 ��Ű�� Ŭ��������
 * step 3 ��Ű�� Ŭ������ ����� �����ؼ� 
 * ���� �����ڸ� �׽�Ʈ �غ��� ����
 * 
 * import : ����Ű ctrl +shift + o
 * import�� �ٸ� ��Ű�� Ŭ������ ����ϱ� ���ؼ� �ۼ��ϴ� ����
 */
public class TestAccessModifier2 {
	public static void main(String[] args) {
		Account a = new Account();
		System.out.println(a.no1);
		//System.out.println(a.no2); // default�� �ٸ���Ű������ ���� �Ұ���
		//System.out.println(a.no3); // private�� �ڽ��� Ŭ������������ ���ٰ���
		a.deposit(200); //public �̹Ƿ� �ٸ� ��Ű������ ���ٰ���
		
		
	}
}
package step7;


public class TestObject3 {
	public static void main(String[] args) {
		// step1
		Employee e = new Employee("1", "������", 400);
		System.out.println(e); // empNo:1 , name:������ salary:400

		// step2
		Engineer en = new Engineer("2", "�̰���", 500, "�ڹ�");
		System.out.println(en); // empNo:1 , name:������ salary:400 skill:�ڹ�

		// step3
		Manager m = new Manager("3", "�迬��", 700, "��������");
		System.out.println(m); // empNo:1 , name:������ salary:400 department:��������

	}
}
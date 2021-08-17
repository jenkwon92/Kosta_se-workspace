package step1;

//��������
public class TestPolymorphismEx {
	public static void main(String[] args) {
		// CompanyService �� �ڽ��� instance variable��
		// 10���� length�� ���� �迭�� �����ϰ� �����ڿ��� �ʱ�ȭ�Ѵ�
		
		CompanyService service = new CompanyService(3);
		service.add(new Manager("12", "������", 500, "��������"));
		service.add(new Engineer("23", "�ں���", 700, "java"));
		service.add(new Employee("35", "���ϴ�", 300));
		service.printAll();
		
		/*
		 * empNo:12 name:������ salary:500 department:�������� 
		 * empNo:23 name:�ں��� salary:700 skill:java 
		 * empNo:35 name:���ϴ� salary:300
		 */
		// ���߼��� : Employee , Manager, Engineer , CompanyService
		System.out.println("********add �Ϸ�***********");

		String empNo = "23";
		Employee emp = service.findEmployeeByEmpNo(empNo);
		System.out.println(emp); // empNo:23 name:�ں��� salary:700 skill:java
		empNo = "35";
		Employee emp2 = service.findEmployeeByEmpNo(empNo);
		
		System.out.println(emp2); // empNo:35 name:���ϴ� salary:300 empNo="99"; 
		
		Employee emp3 = service.findEmployeeByEmpNo(empNo);
		System.out.println(emp3); // null
		
		System.out.println("********find �Ϸ�***********");
		empNo="88";
		int position = service.findPositionByEmpNo(empNo);
		System.out.println(position); //-1 ������ 
		empNo ="35";
		position = service.findPositionByEmpNo(empNo);
		System.out.println(position); //2 //�����ϸ� �����ȣ�� ��ȯ�� 
				
		System.out.println("*****findPositionEmpNo �Ϸ�*****");

		
		empNo = "99";
		service.deleteEmployeeByEmpNo(empNo);
		//�������� ���� ���� �Ʒ��� ���� �޼����� ��µȴ�
		// 99 �����ȣ�� �ش��ϴ� ����� ���� ���� �Ұ� 
		
		//�����ϸ� �����ȣ�� �ش��ϴ� �迭 ��Ҹ� ����
		//���� �� �ڿ��ڷ� ������ �������( �ڿ��� ������)
		empNo="35";
		service.deleteEmployeeByEmpNo(empNo);
		service.printAll();
		System.out.println("*****deleteEmp �Ϸ�*****");
		
		/*
		 	empNo:23 name:�ں��� salary:700 skill:java
		 	empNo:35 name:���ϴ� salary:300  
		 */
	}
}
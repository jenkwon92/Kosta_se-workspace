package step4;

public class TestOverriding2 {
	public static void main(String[] args) {
		//step1
		Employee e=new Employee("1","아이유",400);
		System.out.println(e.getDetails()); //empNo:1 , name:아이유  salary:400
		
		//step2
		Engineer en = new Engineer("2","이강인",500,"자바");
		System.out.println(en.getDetails());
		
		//step3
		Manager m= new Manager("3","김연경",700,"연구개발");
		System.out.println(m.getDetails());
	}
}

package chapter6;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red","auto",2);
		
		System.out.println("c1의 정보 : "+c1.color +" , " + c1.gearType +" , " + c1.door);
		System.out.println("c2의 정보 : "+c2.color +" , " + c2.gearType +" , " + c2.door );
	}
}

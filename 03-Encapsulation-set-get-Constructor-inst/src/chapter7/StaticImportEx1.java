package chapter7;

import static java.lang.System.out;
import static java.lang.Math.random;

public class StaticImportEx1 {
	public static void main(String[] args) {
		//System.out.println(Math.random());
		System.out.println(random());
		out.println(random());
		
		System.out.println(Math.PI);
		out.println(Math.PI);
	}
}

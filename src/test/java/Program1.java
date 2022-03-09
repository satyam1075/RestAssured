
import java.util.Scanner;

import org.testng.annotations.Test;

class Super{
	void one() 
	{
		System.out.println("Enter any string From super");
//		Scanner scan = new Scanner(System.in);
//		String name = scan.next();
//		System.out.println(name);
		System.out.println("End of code");
	}
}

class Sub extends Super{
	void two() {
		System.out.println("From Sub");
	}
}

public class Program1 {
	
	@Test
	public static void main() 
	{
//		System.out.println("Hi");
//		System.out.println("Hello world");
//		method()
		
		Super upcastedRef = new Sub();
		upcastedRef.one();
		System.out.println();
		System.out.println("Hi");
		
		if(upcastedRef instanceof Sub) 
		{
			Sub downcastedRef = (Sub) upcastedRef;
			downcastedRef.one();
			downcastedRef.two();
		}	
		
		
		
		
	}
	
	
	static void method() {
		System.out.println("Hi");
	} 
}



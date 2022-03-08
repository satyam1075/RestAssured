import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Program2 
{
	@Test
	void run() {
		String a= "Hi My Name is";
		System.out.println(a);
		String[] b = a.split(" ");
////		System.out.println(b.toString());
//		System.out.println(b.length);
		int length1 = b.length;
		String reverse1 = "";
	String[] x = new String[length1]; 
		for(int i=0;i<b.length; i++) 
		{
//			System.out.println(b[i]);
			
			for(int j=b[i].length()-1;j>=0; j--) 
			{
				reverse1 = reverse1 + b[i].charAt(j);

			}
			reverse1 = reverse1 + " ";
		}
		
//		String reverse = "";
//		for(String i : x) {
//			System.out.println(i);
//			reverse = reverse+" "+i;
//		}
//		System.out.println(reverse);
		System.out.println("End Of java program");
//	for(String something : x) {
//		System.out.println(something);
//	}
	System.out.println(reverse1);
	}
}

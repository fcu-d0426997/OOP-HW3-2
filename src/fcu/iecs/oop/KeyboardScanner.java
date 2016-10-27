package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
				
		System.out.printf("Enter a integer:");
		int b = a.nextInt();
		
		System.out.printf("Enter a float point number:");
		Double c = a.nextDouble();
		
		System.out.printf("Enter a you name:");
		String d = a.next();
		
		Double e;
		e = b*c;
		
		System.out.printf("Hi %5s, the multiplication of %2d and %7.5f is %8.2e.", d, b, c, e);
		

	}

	
}

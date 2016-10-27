package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter a string1:");
		String b=a.next();
		System.out.print("Enter a string2:");
		String c=a.next();
		
		if (b.compareToIgnoreCase(c)==0)
			System.out.println("The two strings are the same.");
		
		System.out.printf("\n\nEnter a string1:");
		String d=a.next();
		System.out.print("Enter a string2:");
		String e=a.next();
		
		if (d.compareToIgnoreCase(e)!=0)
			System.out.print("The two strings are not the same.");
		
				
	}

}

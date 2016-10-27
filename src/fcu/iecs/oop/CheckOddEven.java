package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Scanner a=new Scanner(System.in);	
	
	System.out.print("Enter an integer:");
	int b=a.nextInt();
	
	if (b%2==0)
	
	System.out.println("The input integer is Even Number.");
	
	else	System.out.println("The input integer is Odd Number.");
	
	}

}

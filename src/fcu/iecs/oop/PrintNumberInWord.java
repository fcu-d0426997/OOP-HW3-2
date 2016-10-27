package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter a integer:");
		int b=a.nextInt();
		int c=0;
		
		if(b<=9)
			c=c+b;
		else System.out.print("The input integer is ¡§OTHER¡¨.");
		
		switch(c)
		{
		case 1:
			System.out.print("The input integer is ¡§ONE¡¨.");
			break;
		case 2:
			System.out.print("The input integer is ¡§TWO¡¨.");
			break;
		case 3:
			System.out.print("The input integer is ¡§THREE¡¨.");
			break;
		case 4:
			System.out.print("The input integer is ¡§FOUR¡¨.");
			break;
		case 5:
			System.out.print("The input integer is ¡§FIVE¡¨.");
			break;
		case 6:
			System.out.print("The input integer is ¡§SIX¡¨.");
			break;
		case 7:
			System.out.print("The input integer is ¡§SEVEN¡¨.");
			break;
		case 8:
			System.out.print("The input integer is ¡§EIGHT¡¨.");
			break;
		case 9:
			System.out.print("The input integer is ¡§NINE¡¨.");
			break;	
			
			
		
		

		}
		
	}

}

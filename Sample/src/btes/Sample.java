package btes;

import java.util.Scanner;

public class Sample {

	protected static void main() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int marks=s.nextInt();
		int m=marks/10;
		switch(m)
		{
		case 10:
		case 9:	
		case 8:
			System.out.println("Excellent");
			break;
		case 7:	
			System.out.println("Very Good");
			break;
		case 6:
		case 5:	
			System.out.println("Good");
			break;
		case 4:	
			System.out.println("Average");
			break;	
		default:	
			System.out.println("Fail");
			break;
			
		
		}

	}

}

package Basicprogram;

import java.util.Scanner;

public class largestoftwonumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();

		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("The number  " + a + "is greater than  " + b);
		}
		else if(b>a)
		{
			System.out.println("The number  " + b +  "is greater than  " + a);
		}
		
		else
			
		{
			System.out.println("The number is equal");
		}
	}

}

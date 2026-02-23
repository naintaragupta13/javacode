package Basicprogram;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		boolean isprime=true;
		
		for(int i=2; i<=n/2; i++)
		{
			
			if(n%i==0) {
				isprime=false;
				break;
			} 
		}		
		
	if(isprime)
	{
		
		System.out.println("The number is prime");
	}
else 
{
	System.out.println("The number is not prime");
}}}

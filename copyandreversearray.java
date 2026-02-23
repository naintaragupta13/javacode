package Arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class copyandreversearray {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int[] firstarray= new int[size];
		int[] secondarray= new int[size];
		System.out.println("Enter the values of first array");
		for(int i=0; i<size; i++)
		{
			
			firstarray[i]=sc.nextInt();
			
		}
		int j=size-1;
		for(int i=0; i<size; i++)
		{
			
		   
			secondarray[j]=firstarray[i];
			j--;
		}
		
		System.out.println("The values of second array is" +Arrays.toString(secondarray));
		
	}


	}



package Arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class check_two_arrayequal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size= sc.nextInt();
		int[] firstarray= new int[size];
		int[] secondarray=new int[size];
		System.out.println("Enter the values for first arrays");
		for(int i=0; i<size; i++) {
			firstarray[i]=sc.nextInt();}
			
		System.out.println("Enter the values for second arrays");
		for(int j=0; j<size; j++) {
			secondarray[j]=sc.nextInt();
			
		}
		System.out.println("The first arrays are:"+ Arrays.toString(firstarray));
		System.out.println("The second arrays are:"+ Arrays.toString(secondarray));
		
		if(Arrays.equals(firstarray, secondarray))
		{
			System.out.println("The two arrays are equal");
			
		}
		
		else {
			
			System.out.println("The two arrays are not equal");
		}
	}

}
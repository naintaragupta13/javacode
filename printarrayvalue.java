package Arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class printarrayvalue {

	

	public static void main(String[] args) {
		
				
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the values of array");
		for(int i=0; i<size; i++) {
			
			arr[i]=sc.nextInt();
		}
		System.out.println("The array values are:");
		
			System.out.println(Arrays.toString(arr));
		
		

	}

}

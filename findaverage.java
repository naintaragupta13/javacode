package Arrayprograms;

import java.util.Scanner;

public class findaverage {

	public static void main(String[] args) {
		int sum=0; double average;
		Scanner sc= new Scanner(System.in) ;

		System.out.println("Enter the size of an array") ;

		int size= sc.nextInt() ; int [] array1= new int[size]; System.out.println(" Enter the array elements ") ;

		for(int i=0; i<size; i++) {

		array1[i]=sc.nextInt() ; sum= sum+ array1[i]; }

		average= (double) sum/size; System.out.println( " The average of array is"+ average) ;

	}

}

package Arrayprograms;

import java.util.Scanner;

public class min_and_max_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;

		System.out.println("Enter the size of an array") ;

		int size= sc.nextInt() ;

		int [] array1= new int[size]; System.out.println(" Enter the array elements ") ;

		for(int i=0; i<size; i++) {

		array1[i]=sc.nextInt() ;
		} 
		int max=array1[0]; 
		int min= array1[0]; 
		for(int i=0; i<size; i++) 
		{ if( array1[i]> max) {

		max=array1[i];

		} if( array1[i]<min) { min=array1[i] ;

		} } System.out.println(" The maximum array present is" + max) ; 
		
		System.out.println(" The minimum array present is" + min) ;
	}

}

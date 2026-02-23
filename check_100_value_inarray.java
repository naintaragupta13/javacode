package Arrayprograms;

import java.util.Scanner;

public class check_100_value_inarray {

	public static void main(String[] args) {
		boolean ispresent= false;
		Scanner sc= new Scanner(System.in) ;

		System.out.println("Enter the size of an array") ;

		int size= sc.nextInt() ; int [] array1= new int[size]; System.out.println(" Enter the array elements ") ;

		for(int i=0; i<size; i++) {

		array1[i]=sc.nextInt() ;

		if( array1[i]== 100) { ispresent= true;
		break;} }

		if(ispresent) { System.out.println(" The number 100 is present ") ; }

		else { System.out.println(" The number 100 is not present ") ; }
	}

}

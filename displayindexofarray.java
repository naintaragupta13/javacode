package Arrayprograms;

import java.util.Scanner;

public class displayindexofarray {

	public static void main(String[] args) {
		boolean ispresent= false;
		int index=-1;
		Scanner sc= new Scanner(System.in) ;

		System.out.println("Enter the size of an array") ;

		int size= sc.nextInt() ; int [] array1= new int[size]; System.out.println(" Enter the array elements ") ;

		for(int i=0; i<size; i++) {

		array1[i]=sc.nextInt() ;

		if( array1[i]== 100) 
		{
			ispresent= true;
			index=i;
		break;
		}
		}

		if(ispresent) { System.out.println(" The number 100 is present at index"+ index) ;
		}

		else { System.out.println(" The number 100 is not present ") ; }
	}}

package Arrayprograms;

import java.util.Scanner;

public class count_char_digit_spaceinstring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;

System.out.println("Enter the string");

String str= sc.nextLine() ;

int alphabets=0; int digits=0; int spaces=0; int special=0;

for(int i=0; i<str.length(); i++) {

char c=str.charAt(i) ;

if(Character.isLetter(c)) { alphabets++;

} else if(Character.isDigit(c)) { digits++;

} else if(c==' ') { spaces++;

} else { special ++;

}}

System.out.println(" The count of alphabets is " + alphabets) ;

System.out.println(" The count of digits is " + digits) ;

System.out.println(" The count special character is" + special) ;

System.out.println(" The count of spaces is " + spaces) ;
	}

}

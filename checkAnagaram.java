package Arrayprograms;

import java.util.Arrays;

public class checkAnagaram {

	public static void main(String[] args) {
		String str1= "silent";
		String str2= "listen";

		str1= str1.replaceAll("\\s+", "") ;

		str2= str2.replaceAll("\\s+", "") ;

		String str1lower= str1.toLowerCase() ;

		String str2lower= str2.toLowerCase() ;

		char [] s1= str1lower.toCharArray() ;

		char [] s2= str2lower.toCharArray() ;

		Arrays.sort(s1) ;
		Arrays.sort(s2) ;

		if(Arrays.equals(s1, s2)) 

		{
		System.out.println(" The two strings are Anagram ") ;

		}

		else

		{

		System.out.println(" The two strings are not Anagram ") ;
		}
	}

}

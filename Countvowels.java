package Basicprogram;

public class Countvowels {

	public static void main(String[] args) {
		String str="testing doc apple";
		int vowels=0;
		String str1= str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch= str1.charAt(i);
		
  if(ch=='a'|| ch=='i' || ch=='e'|| ch=='o' || ch=='u') {

	  vowels ++;
  }
  
	
	}
		
		System.out.println(vowels);
}}
 


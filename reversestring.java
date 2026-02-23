package Arrayprograms;

public class reversestring {
	
	
	
	public static void main(String[] args) {
		String str="Naintara";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--)
		
		{
			rev= rev+str.charAt(i);

		}
   System.out.println("The reverse of string is " + rev);
}}

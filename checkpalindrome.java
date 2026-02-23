package Arrayprograms;

public class checkpalindrome {

	public static void main(String[] args) {
String str="Mom";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--)
		
		{
			rev= rev+str.charAt(i);

		}
		
		if(str.equalsIgnoreCase(rev)) {
			
			System.out.println("The string is palindrome");
		}
		
		else {
			
			System.out.println("The string is not palindrome");
		}

	}

}

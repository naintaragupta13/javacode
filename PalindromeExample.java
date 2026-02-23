package Basicprogram;

public class PalindromeExample {

	public static void main(String[] args) {
		
		
		String str="Mom";
		String rev="";
		String s=str.toLowerCase();
		for(int i=s.length()-1;i>=0;i--)

		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			
			System.out.println("The given string is palindrome");
			
		}
		else
		{
			
			System.out.println("The given string is not palindrome");
		}
		
	}

}

package Basicprogram;

public class palindromestring {

	public static void main(String[] args) {
		String a="Naina";
		String reverse="";
		
	for(int i=a.length()-1; i>=0;i--)
	{
		reverse +=a.charAt(i);
		
	}
	if(a.equals(reverse)) {
		System.out.println("The String is palindrome");
	}
	else
		System.out.println("The String is not palindrome");
	
	}

}

package Basicprogram;

public class Sum_of_number_from_string {

	public static void main(String[] args) {
		String str= "ST65RGY12";
		char[] s=str.toCharArray();
		
		int a= Character.getNumericValue(s[2]);
		int b= Character.getNumericValue(s[3]);
		int c= Character.getNumericValue(s[7]);
		int d= Character.getNumericValue(s[8]);
		
			 int sum=a+b+c+d;
		
	System.out.println("The sum is    " + sum);

	}

}

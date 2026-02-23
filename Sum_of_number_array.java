package Basicprogram;

public class Sum_of_number_array {

	public static void main(String[] args) {
		
		int[] num = {4,2,3,9,6}; 
		int sum=0;
		
		for(int i=0; i<num.length; i++)
		{
			
			sum=sum + num[i];
			
		}
	 System.out.println("The sum of number is " + sum);
	 
	}

}

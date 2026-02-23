package Basicprogram;

public class largest_smallest_element_array {

	public static void main(String[] args) {
		int [] num= {8,20,9,90,101,65,12,78,5,87};
		
		int max= num[0];
		int min= num[0];
		
		for (int i=0; i<num.length; i++) {
			
			if(num[i]>max)
			{
				max=num[i];
			}
			if (num[i]<min) {
				
				min=num[i];
			}
		}
		
		System.out.println("The largest number is   "+ max);
		
		System.out.println("The miniumum number is  " + min);
		
		
		
		
	}

}

package Basicprogram;

public class largestnumberarray {

	public static void main(String[] args) {
		int[] num= {4,8,20,6,18,30};
		
		
		int max =num[0];
		
		for(int i=0; i<num.length; i++)
		{
			
			if(num[i]>max) {
				max=num[i];
				
			}
			
		}System.out.println("The largest number is"+ max);

	}

}

package Basicprogram;

public class StringReverse {

	public static void main(String[] args) {
		String str="Automation";
        String rev="";
        
        for(int i=str.length()-1;i>=0; i--) {
        	
        	rev+=str.charAt(i);
        	
        }
        
        System.out.println("The reverse of word is  " + rev);
	}
	

}

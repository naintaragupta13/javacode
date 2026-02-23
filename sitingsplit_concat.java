package Arrayprograms;

public class sitingsplit_concat {

	public static void main(String[] args) {
		String str= " My name is Naintara";

		String[] words= str.split( " ") ;

		for ( int i=0; i< words.length ; i++)

		{
		System.out.println(words[i]);
		}
		
		String str1 = " Hello";

		String s=str1.concat("world") ;

		System.out.println(s) ;

	}

}

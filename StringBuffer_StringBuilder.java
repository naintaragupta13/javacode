package Arrayprograms;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Welcome") ;

		sb.append(" to Java world") ;
		System.out.println(sb) ;
		sb.delete(3, 5) ;
		System.out.println(sb);
		sb.insert(3, "naina") ; 
		System.out.println(sb);
		sb.replace(3, 5, "rahul") ;
		System.out.println(sb); 
		sb.reverse() ;
		System.out.println(sb);

	}

}

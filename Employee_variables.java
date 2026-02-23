package Arrayprograms;

public class Employee_variables {
	

		final String name= "Naina";  String Dob = "4/6/1996"; boolean employed=false;

		public void empdetails( String ename, int age)

		{ System.out.println(" The name is "+ ename +" And age is"+ age) ; }

		public static void main(String args[])

		{
			Employee_variables e= new Employee_variables();

		e.empdetails (" Rahul", 30) ; 
		System.out.println(e.name + e.Dob+ e.employed) ;

		}

		}
	

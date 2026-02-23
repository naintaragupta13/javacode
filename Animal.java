package Arrayprograms;

public class Animal {



		Animal(String name)
		{

		System.out.println(" The animal name is"+ name);
		}

		Animal(String name, String color)
		{ System.out.println(" The animal name is"+ name + "color is"+ color);
		}

		public static void color(String name, String color)
		{

		System.out.println(" The animal name is" + name+"color is" + color) ; 
		}

		public static void color(String name, String color, String size) 
		{

		System.out.println(" The animal name is" + name+"color is" + color+"size"+ size) ; 
		}

		public void color(String name, int age)
		{

		System.out.println(" The animal name is" + name+" and age is" + age) ; 
		} 
		public static void main(String args[])
		{ 
			Animal a= new Animal ("Cow") ; 
		Animal a1= new Animal ("Cat", "white") ; 
		color ("dog", "black") ; 
		color ("camel", "white", "large") ; 
		a. color("sheep",25) ;

		}

		

	}



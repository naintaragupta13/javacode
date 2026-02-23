package Arrayprograms;

import CoreJavaAssignments.Animal_methodoverriding;

public class AnimalTest_methodoveriding  extends Animal_methodoverriding{
	public void sound( String name, String sound) {

		System.out.println("The name is" + name +"sound is" + sound) ; }

		public void color( String name, String color)
		{ 
			 System.out.println("The name is" +  name +"color is" + color) ; }

		public static void main(String args[]) {

			AnimalTest_methodoveriding at= new AnimalTest_methodoveriding() ;

		at.sound ("dog", "bow bow") ; 
		at.color(" Cat", "black") ; }

		}
package Basicprogram;

public class count_word_string {

	public static void main(String[] args) {
		String str="Welcome to Java coding world";
		String[] str1 = str.split("\\s+");
		int count=str1.length;
		
		System.out.println("The count of word  " + count);
}}
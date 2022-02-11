package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops"; // Declare a String String text1 = "stops";
		String text2 = "potss"; // Declare another String String text2* = "";
		if (text1.length() == text2.length()) // a) Check length of the strings are same then (Use A Condition)
		{

			char a[]  = text1.toCharArray();
			char b[]  = text2.toCharArray();

			Arrays.sort(a);// Sort Both the arrays
			Arrays.sort(b);// Sort Both the arrays

			//boolean result = Arrays.equals(a, b);
			if(Arrays.equals(a, b)){// d) Check both the arrays has same value
				{
				System.out.println(text1 + " and " + text2 + " are Anagram.");
				}}

				else
			{
				System.out.println(text1 + " and " + text2 + " are Not Anagram.");}
			
			
		}
		
		}

}
			
			
		
			
			
		
	

	

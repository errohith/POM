package week1.day2;

public class Factorial {
	/*
	 * Goal: Find the Factorial of a given number
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter 
	 * What are my learnings from this code?
	 * 1)for loop
	 * 2)Factorial
	 * 3)
	 */	
	
	public static void main(String[]args) {
		int input = 5;													// Declare your input as 5
		int Fact = 1;													// Declare an integer variable fact as 1
		for(int i = 1; i <= input; ++i)									// Iterate from 1 to your input (tip: using loop concept
		{
			Fact *= i;	// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			
		}																//End of loop
		System.out.println(Fact);		// Print factorial (fact)
	}
}
	
	



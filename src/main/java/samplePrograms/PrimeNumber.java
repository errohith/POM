package week1.day2;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * input: 13 output: 13 is a Prime Number
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow +enter 
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space+down arrow + enter
	 * What are my learnings from this code? 
	 * 1.for loop
	 * 2.Useage of boolean datatype
	 * 3.if else statement
	 */
	
	public static void main(String[] args) {
		int input = 13;									// Declare an int Input and assign a value 13
		boolean flag = false;							// Declare a boolean variable flag as false
		
		for (int i = 2; i <= input / 2; ++i)			// Iterate from 2 to half of the input	
		{
			if (input % i == 0) {						// Divide the input with each for loop variable and check the remainder
				flag = true;							// Set the flag as true when there is no remainder
				break;									// break the iterator
			}
		}
		if (flag == false)								// Check the flag (Provide a condition)
			System.out.println("Is a Prime Number");	// Print 'Prime' when the condition matches
		else
			System.out.println("Is Not a Prime Number");// Print 'Not a Prime' when the condition doesn't match
	}
}

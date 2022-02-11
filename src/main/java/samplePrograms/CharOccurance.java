package week1.day2;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai"; // String str = "welcome to chennai";

		int length = str.length();
		@SuppressWarnings("unused")
		char[] text = str.toCharArray();
		char num = 'e';
		int count = 0; // declare and initialize a variable count to store the number of occurrences

		for (int i = 0; i < length; i++) { // traverse from 0 till the array length

			if (str.charAt(i) == num) { // Check the char array has the particular char in it
				count++; // if is has increment the count
			}

		}
		System.out.println(num + " ---> number of occurrences  :" + count);// print the count out of the loop
	}

}

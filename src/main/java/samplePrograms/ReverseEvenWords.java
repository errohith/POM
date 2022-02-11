package week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {

		String test = "I am a software tester";// Declare the input as Follow String test = "I am a software tester";
		String[] words = test.split(" ");// split the words and have it in an array

		for (int i = 0; i < words.length; i++) { // Traverse through each word (using loop)

			if (i % 2 != 0) { // find the odd index within the loop (use mod operator)

				System.out.print(" " + reverse(words[i]));

			} else {
				System.out.print(" " + words[i]);
			}

		}
	}

	public static String reverse(String str) {
		char[] charArray = str.toCharArray();
		String revStr = "";
		for (int i = charArray.length - 1; i >= 0; i--) {// print the even position words in reverse order using another
															// loop (nestedloop)
			revStr = revStr + charArray[i]; // Convert words to character array if the position is even else printthe
											// word as it is(concatenate space at the end).
		}

		return revStr;

	}

}

package week1.day2;

public class FindTypes {

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArr = test.toCharArray();// Convert the String to character array
		for (int i = 0; i < charArr.length; i++) {// Traverse through each character (using loop)
			char text1 = charArr[i];
			if (Character.isLetter(text1))// Character.isLetter
				letter++;
			if (Character.isDigit(text1))// Character.isDigit
				num++;
			if (Character.isSpaceChar(text1))// Character.isSpaceChar
				space++;
			else
				specialChar++;// consider as special character

		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
}

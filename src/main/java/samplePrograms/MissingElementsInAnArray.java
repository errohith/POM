package week1.day2;

import java.util.Arrays;

public class MissingElementsInAnArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);					// Sort the array
		for (int i = arr[0]; i < arr.length; i++) {// loop through the array (start i from arr[0] till the length of the array)
			if (i != arr[i - 1]) {// check if the iterator variable is not equal to the array values respectively

				System.out.println("Missing Element in the Array is" + i);// print the number
				break;// once printed break the iteration
			}

		}
		

		

		
		

		

	}

}
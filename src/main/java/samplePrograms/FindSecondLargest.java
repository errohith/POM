package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) 
	{
		
		int data[] = { 2,3,4,6,7,11 };
		 int num = data.length;
		Arrays.sort(data);
		
		int num1 = data [num-2];
		
		System.out.println("Second Largest Element is : " +num1);
	}
}
		
		
	



	

		
		
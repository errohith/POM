package samplePrograms;

import java.util.Scanner;
 
public class secondlowest {
	public static void main(String[] args) {
		int number,sum =0;
		System.out.println("enter array numbers");
		@SuppressWarnings("resource")
		Scanner src = new Scanner(System.in);
             number = src.nextInt();
             int arr[] = new int[number];
             System.out.println("Enter elements of array:");
             for(int i = 0; i < number; i++)
             {
                arr[i] = src.nextInt();
                 sum  = sum + arr[i];
             }
             System.out.println("sum of array:" + sum);
	}

}

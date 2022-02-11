package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		//** Find Fibonacci Series for a Given Range
		//** My Learing From This Code
		//** 1.For Loop
		//** 2.For Shortcut
		//** 3.
		
		
		int n = 8, firstNum = 0, secNum = 1;
		
		System.out.println("Fibonacci Series Number");

		for (int i = 1; i <= n; i++) {
			System.out.println(firstNum );
			int nextNum = firstNum + secNum;
			firstNum = secNum;
			secNum = nextNum;

		}
	}

}

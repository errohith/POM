package week1.day2;

public class ReverseString {
	public static void main(String[] args) {
		String test = " feeling good";
		String rev = "";
		/*int length = test.length();
		
		for (int i = length - 1; i >= 0;i-- )
		{
			rev = rev+test.charAt(i);
		}
		
	}
	System.out.println("Reverse String is :" + test1 );
}*/
		char a[]=test.toCharArray();//Convert the String to character array
		int len=a.length;
		for(int i =len-1; i>=0;i--)//Traverse through each character (using loop in reverse direction)
		{
			rev=rev+a[i];
		}
		System.out.print("Reversed String is :" + rev);//Print the character (without newline -> like below
		   																				//System.out.print(ch);
}
}
	
		
		
		




	

			
			
			
			
			
			

		
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		
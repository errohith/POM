package week1.day2;

public class Palindrome {
	public static void main(String[]args) {
		String text1 = "madam";
		String rev = "";
		
	for(int i = text1.length()-1; i>=0; i--)
	{
	rev = rev+text1.charAt(i);
	}
	System.out.println(rev);
	if(text1.equalsIgnoreCase(rev))
	{
			System.out.println("Given String Palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
		
	}
}

	
	
	
		
	
		
		




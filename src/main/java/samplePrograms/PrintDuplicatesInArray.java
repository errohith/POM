package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		for(int i =0; i<arr.length-1; i++)// get the length of the array// iterate from 0 to the array length-1
		{
			count =0;					  // declare an int variable named count// assign 0 to count 
			for(int j=i+1; j<arr.length; j++)// iterate from i to the length of the array by adding 1 to it
			{
				if(arr[i] == arr[j])		// compare both the loop variables & check they're equal
				{
					count ++;				// increase the count if both the arrays are equal
					
				}
			}
				if(count>0)					// Out of the inner loop, check and print the first array variable if count is more than 0
					
					System.out.println("Dulicate Values are"+arr[i]);
				
			}
		}
	}
	
			
			
			
		
	
			



	
		
		
		

		
		
		
		 
		
			
			
			 
					
				
							
					
			
			
		
	


			
		

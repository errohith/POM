package stringLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(999);
		number.add(666);
		number.add(545);
		number.add(545);
		number.add(545);
		number.add(545);
		number.add(999);
		number.add(666);
		/*String Number = Collections.max(number);
			
		System.out.println(Number);*/
		
		Collections.sort(number);
	/*	
		for (Integer inter : number) {
			
			System.out.println();
			
		}*/
		
		for(int i = 0; i<number.size(); i++) {
			
			Integer max = number.get(0);
			
			if (max < number.get(i)) {
				
				System.out.println(max);
				
			}
			
		}
		
		
		
	}
}



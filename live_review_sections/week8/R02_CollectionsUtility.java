package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class R02_CollectionsUtility {

	public static void main(String[] args) {
	
		ArrayList<Character> list = new ArrayList<>();
		
		list.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		// we can reverse this arraylist
		Collections.reverse(list);
		System.out.println("Reversed list : "+list);
		
		// frequency method that helps to look for an element
		int freOfChar = Collections.frequency(list, 'a');
		System.out.println(freOfChar);
		

	}

}

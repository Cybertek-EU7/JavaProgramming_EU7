package week14;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
// HashSet: no duplicates, does not care about insertion order, no index
		Set<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(100,1,2,8,99,100,null,null));
		System.out.println(set); // [null, 1, 2, 99, 100, 8]
		
// LinkedHashSet: keeps the insertion order, takes null, no duplicates
		Set<Integer> setTwo = new LinkedHashSet<>();
		setTwo.addAll(Arrays.asList(100,1,2,8,99,100,null,null));
		System.out.println(setTwo);// [100, 1, 2, 8, 99, null]
		
// Treeset : does not accept null, sorts the list, no duplicates		
		Set<Integer> setThree = new TreeSet<>();
		setThree.addAll(Arrays.asList(100,1,2,8,99,100));
		System.out.println(setThree);
		
// if I want to use .sort method with  HashSet, can I use it?
//	try {
//		Collections.sort(setTwo); // compiler error
//	}catch(Exception e) {
//		
//	}
	/*	
		Collections.sort(setThree);
	In order to use .sort method our class has to implement Comparable interface
	sort method is using compareTo method 
	*/
	
		
	}

}

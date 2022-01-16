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
		setThree.addAll(Arrays.asList(100,1,2,8,99,100,null,null));
		System.out.println(setThree);
	}

}

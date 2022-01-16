package week14;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// no duplicates, does not care about insertion order, no index
		Set<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(100,1,2,8,99,100,null,null));
		System.out.println(set); // [null, 1, 2, 99, 100, 8]
		

	}

}

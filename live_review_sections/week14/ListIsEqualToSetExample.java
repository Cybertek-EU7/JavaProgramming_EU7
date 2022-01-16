package week14;

import java.util.*;

public class ListIsEqualToSetExample {
	public static void main(String[] args) {
		
List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,5)); 

List<Integer> listTwo = new ArrayList(Arrays.asList(1,2,3,4,5)); 
		
Set<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4,5));

System.out.println(list.equals(set)); // false
System.out.println(list.equals(listTwo)); // true

// how can I verify if set and list is same or includes

System.out.println(list.containsAll(set)); // true

	}

}

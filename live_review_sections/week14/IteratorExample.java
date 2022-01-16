package week14;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		
	List<Integer> nums = new ArrayList<>();	
	
	nums.addAll(Arrays.asList(50,100,10,15,1150,5000));
	
	// let's iterate or traverse the list with iterator object
	
	// create an iterator object
	
	Iterator<Integer> it = nums.iterator();  // polymorphic way
	
	// call hasNext method
	// returns true if there is still a value
	// returns false if it is the end of the list
	
	System.out.println(it.hasNext()); // we put a pointer and moves each time, true
	
	System.out.println("without loop : "+it.next()); //50, this one moves the cursor to next element and reads it
	System.out.println("without loop : "+it.next());
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	// System.out.println(it.next()); // java.util.NoSuchElementException

	// if you want to loop through again, create an iterator object again
	Iterator<Integer> itTwo = nums.iterator();
	
	// what is the difference between or each loop and iterator
	// we can remove objects while looping
	while(itTwo.hasNext()) {  // remove if it equal or more than 100
	//	int val = itTwo.next();
		if(itTwo.next()>=100) {
			itTwo.remove();
		}
		
	}
	
	System.out.println(nums);
	
	
	}

}

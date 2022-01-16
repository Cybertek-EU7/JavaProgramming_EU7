package week14;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.addAll(Arrays.asList(10,100,50,5000));
		System.out.println(((LinkedList<Integer>) list).getFirst());// 10
		// downcasting so I can use methods of LinkedList
// Queue FIFO: first in first out
		System.out.println(((LinkedList<Integer>) list).peek()); // 10
// if this was a stack with the peek() method I would get 5000
		
	((LinkedList<Integer>) list).addFirst(1); // comes from queue interface	
	System.out.println(((LinkedList<Integer>) list).peek()); // 1	
	
	((LinkedList<Integer>) list).addLast(10_000); 
	System.out.println(list);
	
	// When you testing, one of the features that you will have is INDEX
	// get(indexNumber) : top method you will use
	
	System.out.println(list.get(0)); // first element
	System.out.println(list.get(list.size()-1)); // last element
	
	}

}

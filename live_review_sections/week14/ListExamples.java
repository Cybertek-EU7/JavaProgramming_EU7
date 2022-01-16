package week14;

import java.util.*;

public class ListExamples {

	public static void main(String[] args) {
		
		List<String> listOne = new ArrayList<>(); // polymorphism
		listOne.add("oscar");
		
		List<String> listTwo = new Stack<>(); // polymorphism
		
		listTwo.add("oscar");
		listTwo.add("enes");
		listTwo.add("zehra");
		listTwo.add("melek");
		// list can have multiple null values, keeps the insertion order, has index
		// listTwo.add(null);
		// listTwo.add(null);
		
		System.out.println("listTwo : "+ listTwo); // [oscar, enes, zehra, melek, null, null]
		// Stack : Last in First out structure LIFO
		// peek(): takes a look at the last value
		System.out.println( ((Stack<String>) listTwo).peek()); // I need to downcast to use peek method
		
		System.out.println(listOne instanceof List); // true
		System.out.println("listOne before putting info in it : "+listOne);
		listOne = listTwo;  // assigning operator
		System.out.println("listOne : "+listOne);
		
		// iteration with Stack 
		
		// Can I sort the list with Collections.sort method?
		// I can not sort it if it has null values
		if(!listTwo.contains(null)) 
		{
		Collections.sort(listTwo);
		}
		System.out.println("listTwo after sorting : "+listTwo);
		
	}

	}


package week14;

import java.util.*;

public class ListExamples {

	public static void main(String[] args) {
		
		List<String> listOne = new ArrayList<>(); // polymorphism
		
		List<String> listTwo = new Stack<>();
		
		listTwo.add("oscar");
		listTwo.add("enes");
		listTwo.add("zehra");
		listTwo.add("melek");
		// list can have multiple null values, keeps the insertion order, has index
		listTwo.add(null);
		listTwo.add(null);
		
		System.out.println("listTwo : "+ listTwo); // [oscar, enes, zehra, melek, null, null]
		// Stack : Last in First out structure LIFO
		// peek(): takes a look at the last value
		System.out.println(((Stack<String>) listTwo).peek()); // I need to downcast to use peek method
		
		System.out.println(listOne instanceof List); // true
		listOne = listTwo;
		

	}

}

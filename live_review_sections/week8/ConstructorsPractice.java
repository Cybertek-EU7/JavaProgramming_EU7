package week8;

public class ConstructorsPractice {
/*
 * no paramater constructor
 * one arg with int constructor
 * one arg with string constructor
 */

	public ConstructorsPractice() {
		System.out.println("a");
	}
	
	public ConstructorsPractice(int num) { // call no arg constructor from here
		this();
		System.out.println("b");
	}
	
	public ConstructorsPractice(String str) {
		this(10);
		System.out.println("c");
	}
	
	
	public static void main(String[] args) {
		
		
		new ConstructorsPractice("hello"); // I am creating an object, I am calling constructor
		
	}
	
	
	
}

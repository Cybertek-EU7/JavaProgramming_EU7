package week2;

public class UnaryReview {
	
	public static void main(String[] args) {
		/*
		 * two types of increament/decreament operator
		 * pre: place it before the variable
		 * increases or decreases immediately
		 * 
		 * post: place after variable
		 * first passes current value, then inc/decr by 1
		 * 
		 */
		
	int a = 20;
	
	System.out.println(a++); // first prints a in the memory 20, then increase 
	System.out.println(a); // 21

	int b = 20;
	System.out.println(++b); // in memory b becomes 21 in this line
	System.out.println(b); // 21
	
	// ! not operator is used with anything that produces boolean result
	boolean isMarried = true;
	
	System.out.println(!isMarried);
	
	System.out.println(!(10>5));  
		
	}

}

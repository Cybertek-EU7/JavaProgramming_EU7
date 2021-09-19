package week2;

public class DivisionAndRemainderPractice {

	public static void main(String[] args) {
	
	int inputSeconds = 3910;
	int minutes, hours;
	// converted to XX hours XX minutes XX seconds
	/*
	 *  Algorithm 
	 *  1. 1 minute is 60 seconds, 1 hour is 3600 seconds
	 *  2. calculate remaining seconds
	 *  3. find the minutes and with modules we calculate remainder
	 *  4. calculate hours directly by dividing to 3600
	 */
	 int seconds = inputSeconds%60; // calculate remaining seconds
    
	 minutes= inputSeconds/60%60; // find the minutes and with modules we calculate remainder
    
	 hours = inputSeconds/3600; // calculate hours directly by dividing to 3600
	
	System.out.println(hours+ " hours/ "+ minutes + " minutes/ "+ seconds + " seconds");
	
}
}

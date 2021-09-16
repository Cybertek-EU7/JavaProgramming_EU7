package week1;

import java.util.Scanner;

public class ScanerExample {
public static void main(String[] args) {
	
	System.out.println("Output");
	// how do we input in JAVA
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is your dream car make?");
	
	String make = input.next();
	
	System.out.println("your dream car is: "+ make);
	
	
}
}

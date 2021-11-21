package week7;

import java.util.Arrays;

public class R01_CharArray {
public static void main(String[] args) {
	
	char[] letters = {'l','i','s','t','e','n'};
	
	for(char each: letters) {
		System.out.print(each+" ");
	}
System.out.println();
	
	// what are Strings ? sequence of chars, collection of chars	
	
	String word = new String (letters);
	System.out.println(word);
	
	String word2 = "silent";
	
	char [] letters2 = word2.toCharArray();
	
	System.out.println(Arrays.toString(letters2));
	
}
	
}

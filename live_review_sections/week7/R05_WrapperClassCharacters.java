package week7;

public class R05_WrapperClassCharacters {

	public static void main(String[] args) {
		
		// Character : isDigit(),isLetter(),isLowerCase()....
		
		char ch = 'a';
		
		boolean isDigit = Character.isDigit(ch);
		boolean isLetter = Character.isLetter(ch);
		boolean isLowerCase = Character.isLowerCase(ch);
		boolean isUpperCase = Character.isUpperCase(ch);
		
		// special characters : !, @, # 
		
		boolean isSpecial = ! Character.isLetterOrDigit(ch); // if it is not digit or letter 
		
		System.out.println(isDigit);
		System.out.println(isLetter);
		System.out.println(isLowerCase);
		System.out.println(isUpperCase);
		System.out.println(isSpecial);
		
	}
	
}

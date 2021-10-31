package week5;

public class S08_CustomStringMethodsStaticWay {

	public static void main(String[] args) {
	
		String s = "aabcccd";
		System.out.println("----frequency-----");
		System.out.println("Frequency of my character: " + frequency(s,'e'));
		System.out.println("-----unique------");
		System.out.println("Unique characters in my string is: "+ uniqueCharacters(s));
		
		
	}

	public static int frequency(String string, char c) {  // our base methods for coming tasks
		
		int count = 0;  // dummy variable that holds my counter
		// algorithm
		// first check if the string contains or not: return error
		// iterate throughout the whole string and check how many that char is in there
		// we get each char with charAt(i) method
//		if (!string.contains(""+c)) {
//			count = -1;
//			return count;
//		}

		for (int i =0; i<string.length(); i++) {
				
				if(string.charAt(i) == c) {
					count++;
				}
			}
		
		return count;
	}
	

	public static String uniqueCharacters(String str) {
		String result = ""; // creating a dummy result value to hold my result object
		
		for (int i = 0; i < str.length() ; i++ ) {
			
			// aabcccd
			
			char c = str.charAt(i); // a
			if(frequency(str, c)==1) {
				result += c;
			}
		}
		
		return result;
	}
	
	public static String removeDuplicate(String str) {
		String result = ""; // creating a dummy result value to hold my result object
		
		for (int i = 0; i< str.length(); i++) {
			String each = ""+ str.charAt(i);
			if (result.contains(each)) {
				continue;
			}
			result += each;
			
		}
		
		return result;
		
	}
	
	
}

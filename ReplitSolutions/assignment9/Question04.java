package assignment9;

public class Question04 {

	public static void main(String[] args) {
		System.out.println(word("a"));
		System.out.println(word("abcde"));
		System.out.println(word("abcdefhıg"));
		System.out.println(word("123456789"));

	}

	public static String word(String str) {
		if (str.length() >= 5 && str.length() % 2 == 1) {
			str = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
		} else {
			return "invalid";
		}
		return str;
	}
}
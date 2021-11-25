package assignment9;

public class Question05 {

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "def";

		if (word1.length() != 3 || word2.length() != 3) {
			System.out.println("cannot merge");
		} else {
			for (int i = 0; i < word1.length(); i++) {
				char c = word1.charAt(i);
				char d = word2.charAt(i);
				System.out.print(c);
				System.out.print(d);
			}
		}
	}
}
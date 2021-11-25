package assignment9;

public class Question06 {

	public static void main(String[] args) {
		String word = "abcde";

		if (word.length() > 5) {
			System.out.println("too long");
		} else if (word.length() < 5) {
			System.out.println("too short");
		} else if (word.length()==5){
			for (int i = 4; i >= 0; i--) {
				char c = word.charAt(i);
				System.out.print(c);

			}
		}
	}
}
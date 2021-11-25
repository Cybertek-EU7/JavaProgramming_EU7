package assignment9;

public class Question15 {

	public static void main(String[] args) {
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catdogcat"));
	}

	public static boolean catDog(String str) {

		int countcat = 0;
		int countdog = 0;

		if (str.length() >= 3) {
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 3).equals("cat"))
					countcat = countcat + 1;
			}

			for (int j = 0; j < str.length() - 2; j++) {
				if (str.substring(j, j + 3).equals("dog"))
					countdog = countdog + 1;
			}
		}

		if (countdog == countcat)
			return true;

		return false;

	}
}
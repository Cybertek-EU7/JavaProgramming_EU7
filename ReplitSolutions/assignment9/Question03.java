package assignment9;

public class Question03 {

	public static void main(String[] args) {
		System.out.println(word("a"));
		System.out.println(word("abcde"));
		System.out.println(word("abcdefhı"));
		System.out.println(word("ab"));

	}

	public static String word(String str) {
		if (str.length() > 1 && str.length() % 2 == 1) {
			str = str.substring((str.length() - 1) / 2, (str.length() + 1) /2);
		} else if (str.length() == 1) {
			str = str + str + str;
		}else if (str.length()>4&&str.length()%2==0) {
			str=str.substring(str.length()/2-1, str.length()/2+1);
		}else if (str.length() == 2) {
			str = str + str;
		}
		return str;
	}
}

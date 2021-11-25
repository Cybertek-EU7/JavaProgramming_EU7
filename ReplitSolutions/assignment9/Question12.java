package assignment9;

public class Question12 {

	public static void main(String[] args) {
		String str = "applex";
		
		if (str.startsWith("x")||str.startsWith("X"))
			str = str.substring(1);
		if (str.endsWith("x")||str.endsWith("X"))
			str = str.substring(0, str.length() - 1);
		System.out.println(str);
	}
}

package assignment9;

public class Question10 {

	public static void main(String[] args) {
		String email = "mike_tyson@gmail.com";

		int underscore = email.indexOf("_");
		int place = email.indexOf("@");
		int dot = email.indexOf(".");
		String name = email.substring(0, underscore);
		String name1 = name.substring(0, 1).toUpperCase() + name.substring(1);
		String lastname = email.substring(underscore + 1, place);
		String lastname1 = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
		String domain = email.substring(place + 1, dot);
		String topLevelDomain = email.substring(dot + 1);
		System.out.println("First name: " + name1 + "\nLast name: " + lastname1 + "\nDomain: " + domain
				+ "\nTop-Level Domain: " + topLevelDomain);

	}
}
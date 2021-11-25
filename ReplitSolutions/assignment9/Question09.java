package assignment9;

public class Question09 {

	public static void main(String[] args) {
		String email = "mike_tyson@gmail.com";

		if (email.contains("_")) {
			int underscore = email.indexOf("_");
			int place = email.indexOf("@");
			String name = email.substring(0, underscore);
			String surname = email.substring(underscore + 1, place);
			String add = email.substring(place);
			System.out.println(surname + "_" + name + add);
		} else {
			System.out.println(email);
		}

	}

}

package assignment9;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "";
		System.out.println("Please enter A,B,C or D : ");
		String start = input.next();
		char charstart = start.charAt(0);
		System.out.println("Please enter A,B,C or D : ");
		String end = input.next();
		char charend = end.charAt(0);
		if (charstart == charend) {
			System.out.println((char) charstart + " found");
		} else if (charend < charstart)
			charend += 4;
		for (; charstart < charend; charstart++) {
			if (charstart % 4 == 0)
				result += "up";
			else if (charstart % 4 == 1)
				result += "right";
			else if (charstart % 4 == 2)
				result += "down";
			else
				result += "left";
			if (charstart < charend - 1)
				result += " > ";
		}
		System.out.println(result);
	}
}
package assignment9;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		double price = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select screen size: ");
		double size = sc.nextDouble();
		if (size == 13.3) {
			price += 200;
		} else if (size == 15.0) {
			price += 300;
		} else if (size == 17.3) {
			price += 400;
		}
		System.out.println("Select CPU type: ");
		String cpu = sc.next();
		if (cpu.equals("i3") ) {
			price += 150;
		} else if (cpu.equals("i5")) {
			price += 250;
		} else if (cpu.equals("i7")) {
			price += 350;
		}
		System.out.println("Select RAM size: ");
		int ram = sc.nextInt();
		price += 50 * (ram / 4);

		System.out.println("Select storage type: ");
		String storage = sc.next();
		System.out.println("Enter memory size: ");
		int memory = sc.nextInt();
		if (storage.equals("HDD") ) {
			price += 50 * (memory / 500);
		} else if (storage.equals("SDD")) {
			price += 100 * (memory / 500);
		}
		System.out.println("Enter screen resolution: ");
		String screen = sc.next();
		if (screen.equals("FULLHD") ) {
			price += 100;
		} else if (screen.equals("4K") ) {
			price += 200;
		}
		System.out.println("Laptop price is: $" + price);

	}

}

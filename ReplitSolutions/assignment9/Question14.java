package assignment9;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		double price = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("Do you have a US driver license?");
		String dlicense = sc.next();
		if (dlicense.equals("No")) {
			System.out.println("Invalid Data");
			System.exit(0);
		}

		System.out.println("Enter your zip code");
		int zipcode = sc.nextInt();
		if (zipcode == 20910 || zipcode == 20740) {
			price += 60;
		} else if (zipcode == 22102 || zipcode == 22103) {
			price += 30;
		} else {
			price += 50;
		}
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		String own = sc.next();
		if (own.equalsIgnoreCase("owned")) {
			price += 10;
		} else {
			price += 20;
		}
		System.out.println("How is this vehicle primarily used?");
		String used = sc.next();
		if (used.equalsIgnoreCase("Business")) {
			price += 50;
		} else if (used.equalsIgnoreCase("pleasure")) {
			price += 10;
		} else if (used.equalsIgnoreCase("commute")) {
			price += 20;
		}
		System.out.println("Days Driven To Work And/Or School");
		int day = sc.nextInt();
		price += day * 5;
		System.out.println("Miles Driven To Work And/Or School");
		int mile = sc.nextInt();
		price += mile * 1;
		System.out.println("How old are you?");
		int age = sc.nextInt();
		if (age < 16) {
			System.out.println("invalide age");
			System.exit(0);
		} else if (age > 16 && age <= 18) {
			price *= 20;
		} else if (age > 18 && age <= 21) {
			price *= 6;
		} else if (age > 21 && age < 25) {
			price *= 2;
		}
		System.out.println("How many years you've been driving?");
		int years = sc.nextInt();
		if (years <= 0 || age - years <= 16) {
			System.out.println("invalide");
			System.exit(0);
		} else {
			price -= years * 5;

			System.out.println("Have you had any accidents in the last 5 years?");
			String acc = sc.next();
			if (acc.equalsIgnoreCase("yes")) {
				System.out.println("How many?");
				int acc1 = sc.nextInt();
				price += price * 0.20;
			}

			System.out.println("Have you had continuous insurance for the past 12 months");
			String insurance = sc.next();
			if (insurance.equalsIgnoreCase("no")) {
				price = price * 2;
			}

			System.out.println("What is the highest level of education you have completed?");
			String education = sc.next();
			if (education.equalsIgnoreCase("Ph.D.") || education.equalsIgnoreCase("Bachelors")
					|| education.equalsIgnoreCase("Masters")) {
				price -= price * 0.05;
			} else if (education.equalsIgnoreCase("Doctors")) {
				price -= price * 0.10;
			} else if (education.equalsIgnoreCase("Less than High School")) {
				price += price * 0.05;
			}
			String reference = name.substring(0, 2) + age + name.substring(name.length() - 2) + zipcode + education;

			System.out.println(name + ", here's your quote!");

			System.out.println("Start Your Policy Today For: " + price);

			System.out.println("Reference number: " + reference.toUpperCase());

		}
	}
}

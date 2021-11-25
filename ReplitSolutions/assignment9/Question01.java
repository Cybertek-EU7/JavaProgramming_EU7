package assignment9;

public class Question01 {

	public static void main(String[] args) {
		tipCalculater(true, 4, 476, "Excellent");
	}

	private static void tipCalculater(boolean isSplit, int numberofPeople, double checkAmount, String ServiceQ) {

		double totalPerPerson, totalToPay, tipPerPerson;
		double totalTip = 0;

		if (isSplit) {
			if (ServiceQ.equals("Poor")) {
				totalTip = checkAmount * 0.05;
			} else if (ServiceQ.equals("Fair")) {
				totalTip = checkAmount * 0.10;
			} else if (ServiceQ.equals("Good")) {
				totalTip = checkAmount * 0.15;
			} else if (ServiceQ.equals("Great")) {
				totalTip = checkAmount * 0.20;
			} else if (ServiceQ.equals("Excellent")) {
				totalTip = checkAmount * 0.25;
			}

			tipPerPerson = totalTip / numberofPeople;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay / numberofPeople;
			System.out.print("Number of people entered: ");
			for (int i = 0; i < numberofPeople; i++)
				System.out.print("&");
			System.out.println("");

			System.out.println("Total to pay: " + totalToPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		}

	}

}

import java.util.Scanner;

public class deliverable_two_UnicodeCalculator2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String firstString = scnr.nextLine();
		String secondString = scnr.nextLine();
		int absoluteValue;
		System.out.println("Please enter two words: ");

		int sumOfFirstString = sumStrings(firstString);
		int sumOfSecondString = sumStrings(secondString);
		absoluteValue = Math.abs(sumOfSecondString - sumOfFirstString);

		System.out.println("Difference (as absolute value): " + (absoluteValue));
	}

	public static int sumStrings(String word) {

		int sumOfString = 0;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int value = word.charAt(i);
			System.out.println(c + ": " + value);
			if (Character.isLetter(word.charAt(i))) {
				sumOfString += word.charAt(i);
			}
		}
		return sumOfString;

	}
}

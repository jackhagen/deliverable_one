public class deliverable_one_WhatToEat {

	public static void main(String[] args) {

		String eventType1 = "casual";
		String eventType2 = "semi-formal";
		String eventType3 = "formal";
		int partySize = 1;

		printWhatToEat(eventType1, partySize);
		printWhatToEat(eventType2, 4);
		printWhatToEat(eventType3, 17);
	}

	public static void printWhatToEat(String eventType, int partySize) {

		String mealSuggestion = "";
		String preparationSuggestion = "";

		if (partySize == 1) {
			preparationSuggestion = "in the microwave";
		} else if ((partySize <= 12) && (partySize >= 2)) {
			preparationSuggestion = "in the kitchen";
		} else if (partySize >= 13) {
			preparationSuggestion = "by a caterer";
		}

		if (eventType.equalsIgnoreCase("casual")) {
			mealSuggestion = "sandwiches";

		} else if (eventType.equalsIgnoreCase("semi-formal")) {
			mealSuggestion = "fried chicken";
		} else if (eventType.equalsIgnoreCase("formal")) {
			mealSuggestion = "chicken parmesan";
		}

		System.out.println("Since you're hosting a " + eventType + " event for " + partySize + " you should serve "
				+ mealSuggestion + " prepared " + preparationSuggestion + ".");
	}

}

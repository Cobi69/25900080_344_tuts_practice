
public class Greeter {
	public static void main(String[] args) {
		if (args.length > 0) {
			greeter(args[0]);
		} else {
			System.out.println("No name provided.");
		}
	}

	/**
	 * Greets the user with a long message.
	 * @param name Name of the user
	 */
	public static void greeter(String name) {
		String message = String.format(
			"Good day, %s!\n\n"
			+ "We hope this message finds you well. It's a pleasure to welcome you, "
			+ "and we wish you nothing but the best in all your endeavors today. Take "
			+ "a moment to appreciate the little things around you – the warmth of the sun, "
			+ "the fresh air, and the simple joys that each new day brings.\n\n"
			+ "As you go about your activities, remember to take time for yourself. Enjoy "
			+ "a nice cup of coffee or tea, read a good book, or simply take a stroll and "
			+ "enjoy the beauty of nature. Whatever you do, make sure it brings you happiness "
			+ "and fulfillment.\n\n"
			+ "Remember, every day is a new opportunity to learn, grow, and make a positive "
			+ "impact. Embrace challenges with confidence, knowing that each step you take "
			+ "brings you closer to your goals. Stay positive, keep smiling, and spread kindness "
			+ "wherever you go.\n\n"
			+ "Wishing you a wonderful day ahead, filled with success and joy. Take care, and "
			+ "make the most of every moment, %s.\n\n"
			+ "Best regards,\n"
			+ "The Team", name, name);
		System.out.println(message);
	}
}


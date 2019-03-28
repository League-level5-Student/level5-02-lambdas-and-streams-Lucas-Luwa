package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		// 2. Call the printCustomMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String holder = "";
			for (int i = 0; i < s.length(); i++) {
				holder += s.charAt(s.length() - 1 - i);
			}
			System.out.println(holder);
		}, "REPEAT");
		// 3. Call the printCustomMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String holder = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 1) {
					String x = s.toLowerCase();
					holder += x.charAt(i);
				} else {
					String y = s.toUpperCase();
					holder += y.charAt(i);
				}
			}
			System.out.println(holder);
		}, "Repeated");
		// 4. Call the printCustomMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String holder = "";
			for (int i = 0; i < s.length(); i++) {
				holder += s.charAt(i);
				holder += ".";
			}
			System.out.println(holder);
		}, "REPEATING");
		// 5. Call the printCustomMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String holder = "";
			for (int i = 0; i < s.length(); i++) {
				String l = "" + s.charAt(i);
				if (l.equalsIgnoreCase("a") || l.equalsIgnoreCase("e") || l.equalsIgnoreCase("i")
						|| l.equalsIgnoreCase("o") || l.equalsIgnoreCase("u") || l.equalsIgnoreCase("y")) {
				} else {
					holder += s.charAt(i);
				}
			}
			System.out.println(holder);
		}, "REPETITIVE");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
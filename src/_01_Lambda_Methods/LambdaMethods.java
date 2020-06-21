package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String newString = new StringBuilder(s).reverse().toString();
			System.out.println(newString);
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String newString = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
			System.out.println(newString);
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String newString = "";
			for (int i = 0; i < s.length(); i++) {
				newString += "." + s.substring(i, i+1);
			}

			System.out.println(newString);
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage(s->{
			String newString = "";
			for (int i = 0; i < s.length(); i++) {
				char z = s.charAt(i);
				if (!(z=='a' || z=='e' || z=='i' || z=='o' || z=='u')) {
					newString += s.substring(i, i+1);
				}
			}
			System.out.println(newString);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	

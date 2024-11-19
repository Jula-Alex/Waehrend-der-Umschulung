package atm;

import java.util.Scanner;

public class Utility {
	static Scanner scanner = new Scanner(System.in);
	
	public static String GetUserInput(String prompt) {
		System.out.println("Enter " + prompt);
		return scanner.nextLine();
	}
	
	
	public static void PressEnterToContinue() {
		System.out.println("\nPress Enter to continue...");
		scanner.nextLine();
	}
}

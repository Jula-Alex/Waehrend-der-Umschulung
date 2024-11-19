package atm;

import java.util.Scanner;

public class Validator {
	Scanner scanner = new Scanner(System.in);
	
	// Costruttore che accetta un oggetto Scanner
	public Validator(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public int getValidatedInteger() {
		while(true) {
			System.out.println("Enter your card number");
			String input = scanner.nextLine();
			
			// Controlla se l'input e' un numero intero
			if(isInteger(input)) {
				return Integer.parseInt(input);
			} else {
				System.out.println("Error: please enter just numbers.");
			}
		}
	}
	
	
}

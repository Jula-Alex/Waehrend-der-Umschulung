package rechner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String antwort = "";
		
		while (!antwort.equals("exit")) {
			
		try {
			System.out.print("Willkommen im Taschenrechnerprogramm\nGib ein Nummer ein: ");
			double input1 = scanner.nextDouble();
			System.out.print("Jetzt den zweite Nummer: ");
			double input2 = scanner.nextDouble();
			System.out.println("Welche mathematische Operation möchtest du durchführen ?");
			String antwort1 = scanner.next();
				
			switch (antwort1) {
			case "+": {
				System.out.println("Den Ergebnis ist: " + (input1 + input2));
				break;
			}
			case "-": {
				System.out.println("Den Ergebnis ist: " + (input1 - input2));
				break;
			}
			case "*": {
				System.out.println("Den Ergebnis ist: " + (input1 * input2));
				break;
			}
			case "/": {
				System.out.println("Den Ergebnis ist: " + (input1 / input2));
				break;
			}
			default:
				throw new Exception("Unexpected value: " + antwort1);
				}
			System.out.println("Wenn du den Taschenrechnerprogramm weiter nutzen willst druck Eingabe oder gib 'exit' ein um den Programm abzuschließen: ");
			
		} catch (Exception e) {
			System.out.println("Invalid Input.");
		}	
		
		}
		
		System.out.println("Vielen Dank, dass du das Programm genutzt hast.");
		scanner.close();
	}
}

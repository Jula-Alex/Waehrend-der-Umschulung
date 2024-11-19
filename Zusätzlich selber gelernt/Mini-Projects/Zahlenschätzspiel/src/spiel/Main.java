package spiel;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String exit = "";

		while (!exit.equals("exit")) {
			boolean isValid = false;
			int randomNum = random.nextInt(1, 11);
			System.out.println("Willkommen bei dem Zahlenrätselspiel!");
			System.out.println(
					"Ein nummer wird generiert zwischen 1 und 10, wenn du den nummer schätzt, hast gewonnen!\nBitte gebe deine einschätzung ein.");

			while (!isValid) {
				try {
					int inputNum = scanner.nextInt();
					if (inputNum < randomNum) {
						System.out.println("Deine schätzung ist zu niedrig.");
					} else if (inputNum > randomNum) {
						System.out.println("Deine schätzung ist zu hoch.");
					} else {
						System.out.println("Korrekt!");
						isValid = true;
					}

				} catch (Exception e) {
					System.out.println("Du musst ein Nummer eingeben!");
					scanner.nextLine();
				}
			}
			System.out.println(
					"Herzlichen Glückwunsch, du hast das Spiel gewonnen. Wenn du weiter spielen möchtest drücke Eingabe sonst tippe n an");
			
			scanner.nextLine();
			exit = scanner.nextLine().toLowerCase();
			
		}
		scanner.close();
		System.out.println("Vielen Dank, dass Sie mein Programm gespielt haben.");
	}

}

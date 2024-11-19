package flächeRechner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exit = "";

		while (!exit.equals("exit")) {

			System.out.println(
					"Welche Fläche möchtest du rechnen ? Gebe ein 'r' wenn für rechteck oder irgendwasanderes für Kreis");
			String antwort = scanner.nextLine();

			if (antwort.equals("r")) {
				System.out.println("Bitte gebe die höhe des rechtecks ein.");
				double höhe = scanner.nextDouble();
				System.out.println("Bitte gebe die breite des rechtecks ein");
				double breite = scanner.nextDouble();
				System.out.println("Die Ergebnis ist " + höhe * breite);
			} else {
				System.out.println("Bitte gebe die radius des Kreises ein.");
				double radius = scanner.nextDouble();
				System.out.println("Die Ergebnis ist: " + Math.PI * radius);
			}
			System.out.println("Um weiter zu rechnen drücke Eingabe oder tippe exit ein um den Programm abzuschliessen");
			exit = scanner.nextLine();
			exit = scanner.nextLine();
		}
		scanner.close();
		System.out.println("Programm abgeschlossen");
	}

}

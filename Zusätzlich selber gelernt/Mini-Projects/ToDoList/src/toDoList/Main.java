package toDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> liste = new ArrayList<>();
		String befehl = "";
		String aufgabe;


		while (!befehl.equals("e")) {
			System.out.println("Willkommen im Aufgabenlisten-Programm.\nWas möchten Sie tun?"
					+ "\nGib 1 ein, um eine Aufgabe zur Liste hinzuzufügen.\nGib 2 ein, um eine "
					+ "Aufgabe aus der Liste zu entfernen.\nGib 3 ein, um die Liste anzusehen.\nGig"
					+ " 'e' ein, um das Programm zu beenden.");
			befehl = scanner.nextLine();

			if (befehl.equals("1")) {
				System.out.println("Bitte gib den Namen der Aufgabe ein, die zur Liste hinzugefügt werden soll.");
				aufgabe = scanner.nextLine();
				liste.add(aufgabe);
				System.out.println("Aufgabe hinzugefügt.");
			} else if (befehl.equals("2")) {
				System.out.println("Welche Aufgabe möchtest du entfernen ?");
				for (int i = 0; i < liste.size(); i++) {
					System.out.println(i + " " + liste.get(i));
				}
				int remove = scanner.nextInt();
				liste.remove(remove);
			} else if (befehl.equals("3")) {
				for (int i = 0; i < liste.size(); i++) {
					System.out.println(i + " " + liste.get(i));
				}
			} else {
				System.out.println("Ungültige wahl!");
			}
			
		}
	}

}

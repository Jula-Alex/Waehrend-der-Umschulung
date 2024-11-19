package combatGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int spielerHp = 70;
		int feindHp = 20;

		int spielerAttack = 5;
		int feindAttack = 15;

		int heilen = 10;

		// devi prendere ogni Stringa e creare un nuovo array di char per ogni stringa e
		// poi trasformare ogni stringa in char

		String befehl;
		String spielerZug0 = ("-- Spielerzug --");
		String spielerHP1 = ("Spieler Hp - " + spielerHp + ". Feind Hp - " + feindHp);
		String angreifenHeilen2 = ("Gib 'a' ein, um anzugreifen, oder 'h',um zu heilen.");
		String spielerAngriff3 = ("Der Spieler hat den Feind angegriffen und 5 Schaden zugefügt.");
		String spielerHeilt4 = ("Der Spieler heilt und gewinnt 10 Lebenspunkte hinzu.");
		String elseIf5 = ("Gib 'a' ein, um anzugreifen, oder 'h',um zu heilen.");
		String feindZug6 = ("-- Feindzug --");
		String feindAngriff7 = ("Der Feind hat den Spieler angegriffen und 15 Schaden zugefügt.");
		String feindHeilt8 = ("Der Spieler heilt und gewinnt 10 Lebenspunkte hinzu.");
		String spielerGewinnt9 = ("Der Spieler hat gewonnen !");
		String feindGewinnt10 = ("Der Feind hat gewonnen !");
		String[] stringhe = { spielerZug0, spielerHP1, angreifenHeilen2, spielerAngriff3, spielerHeilt4, elseIf5,
				feindZug6, feindAngriff7, feindHeilt8, spielerGewinnt9, feindGewinnt10 };
		int sleep = 100;

		List<char[]> listaDiCharArray = new ArrayList<>();

		// Iterazione sull'array di stringhe
		for (String stringa : stringhe) {
			// Conversione della stringa in un array di caratteri
			char[] arrayDiChar = stringa.toCharArray();
			// Aggiunta dell'array di caratteri alla lista
			listaDiCharArray.add(arrayDiChar);
		}

		while (spielerHp > 0 && feindHp > 0) {
			// -- Spielerzug --
			for (char c : listaDiCharArray.get(0)) {
				System.out.print(c);
				Thread.sleep(sleep);
			}
			System.out.println();
			
			System.out.println("Spieler Hp - " + spielerHp + ". Feind Hp - " + feindHp);
			
			for (char c : listaDiCharArray.get(2)) {
				System.out.print(c);
				Thread.sleep(sleep);
			}
			System.out.println();

			befehl = scanner.nextLine();

			while (!befehl.equals("a") || !befehl.equals("h")) {

				if (befehl.equals("a")) {
					for (char c : listaDiCharArray.get(3)) {
						System.out.print(c);
						Thread.sleep(sleep);
					}
					System.out.println();
					feindHp -= spielerAttack;
					break;
				} else if (befehl.equals("h")) {
					for (char c : listaDiCharArray.get(4)) {
						System.out.print(c);
						Thread.sleep(sleep);
					}
					System.out.println();
					spielerHp += heilen;
					break;
				} else
					for (char c : listaDiCharArray.get(2)) {
						System.out.print(c);
						Thread.sleep(sleep);
					}
				System.out.println();
			}

			// -- Feindzug --

			for (char c : listaDiCharArray.get(6)) {
				System.out.print(c);
				Thread.sleep(sleep);
			}
			System.out.println();
			System.out.println("Spieler Hp - " + spielerHp + ". Feind Hp - " + feindHp);

			int feindWahl = random.nextInt(0, 2);

			if (feindWahl == 0) {
				for (char c : listaDiCharArray.get(7)) {
					System.out.print(c);
					Thread.sleep(sleep);
				}
				System.out.println();
				spielerHp -= feindAttack;
			} else {
				for (char c : listaDiCharArray.get(8)) {
					System.out.print(c);
					Thread.sleep(sleep);
				}
				System.out.println();
				feindHp += heilen;
			}
		}
		
		
		if (spielerHp > feindHp) {
			for (char c : listaDiCharArray.get(9)) {
				System.out.print(c);
				Thread.sleep(sleep);
			}
			System.out.println();
		} else
			for (char c : listaDiCharArray.get(10)) {
				System.out.print(c);
				Thread.sleep(sleep);
			}
		System.out.println();
	}

}

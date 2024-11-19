package diceGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int playerScore = 0;
		int enemyScore = 0;
		String input = "";
		
		while (!input.equals("exit")) {
			int playerNum = random.nextInt(1, 7);
			int enemyNum = random.nextInt(1,7);

		System.out.println("Der Punktestand ist jetzt - Du : " + playerScore + ". Feind : " + enemyScore + ".");
		System.out.println("Drücke eine beliebige Taste, um die Würfel zu werfen.");
		scanner.nextLine();
		System.out.println("Du hast ein " + playerNum + " gewürfelt");
		System.out.println("...");
		System.out.println("Feind hat ein " + enemyNum + " gewürfelt");
		
		if(playerNum < enemyNum) {
			System.out.println("Feind gewinnt diese Runde");
			enemyScore++;
		} else if(playerNum > enemyNum) {
			System.out.println("Du hast gewonnen diese Runde");
			playerScore++;
		} else {
			System.out.println("Keine hat gewonnen diese Runde");
		}
		
		if(playerScore == 5) {
			System.out.println("Der Punktestand ist jetzt - Du : " + playerScore + ". Feind : " + enemyScore + ".");
			System.out.println("Du hast das Spiel gewonnen.");
			System.out.println("Wenn du weiter spielen möchtest drücke eine beliebige taste oder tippe 'Exit' ein um das Programm abzuschließen.");
			input = scanner.nextLine().toLowerCase();
			playerScore = 0;
			enemyScore = 0;
		} else if(enemyScore == 5) {
			System.out.println("Der Punktestand ist jetzt - Du : " + playerScore + ". Feind : " + enemyScore + ".\n");
			System.out.println("Feind hat das Spiel gewonnen.");
			System.out.println("Wenn du weiter spielen möchtest drücke eine beliebige taste oder tippe 'Exit' ein um das Programm abzuschließen.");
			input = scanner.nextLine().toLowerCase();
			playerScore = 0;
			enemyScore = 0;
		}
	  }
		System.out.println("Vielen Dank, dass du mein Programm probiert hast.:)");
		
	}

}

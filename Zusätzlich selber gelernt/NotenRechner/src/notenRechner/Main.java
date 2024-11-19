package notenRechner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> blockNummer = new ArrayList<>();
		ArrayList<String> blockName = new ArrayList<>();
		ArrayList<Float> blockNote = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		float summeNoten = 0, BlöckeZähler;
		
		System.out.println("Wie viele Blöcke willst du eingeben? ");
		BlöckeZähler = scanner.nextInt();
		
		for (int i = 0; i < BlöckeZähler; i++) {
			System.out.println("Gib die Block nummer " + (i + 1) + ". ein: ");
			blockNummer.add(scanner.nextInt());	
			scanner.nextLine();
			
			System.out.println("Gib den Namen des Blocks " + (i + 1) + ". ein: ");
			blockName.add(scanner.nextLine());
			
			System.out.println("Gib die Note des Blocks " + (i + 1) + ". ein: ");
			String blockNoteString = scanner.nextLine();
			
			blockNoteString = blockNoteString.replace(',', '.');
			float note = Float.parseFloat(blockNoteString);
			blockNote.add(note);	
		}
		
		scanner.close();
		
		for (int i = 0; i < BlöckeZähler; i++) {
			System.out.println(blockNummer.get(i) + "\t" + blockName.get(i) + "\t" + blockNote.get(i));
			summeNoten += blockNote.get(i);
		}
		
		float durchschnittNote = (float)summeNoten / (float)BlöckeZähler;  
		
		
		System.out.println("Die durchschnittliche Note lautet: " + durchschnittNote);
		
		// erweiterung wenn mann die blocknummer eingibt dann kommt die name automatisch 
		
	}
}

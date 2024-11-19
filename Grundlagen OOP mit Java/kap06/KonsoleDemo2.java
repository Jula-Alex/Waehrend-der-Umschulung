//kap06/KonsoleDemo2.java
import java.util.Scanner;


public class KonsoleDemo2 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Delimiter ist per Default Leerzeichen, Token ist Zeichengruppe zwischen 2 Delimiters
		//ganze Zeile einlesen: nextLine()
		//nächste Token als String: next()
		//nächste Token als int: nextInt()
		System.out.printf("Bitte Ihr Alter eingeben>");
		int alter = 0;
		if (scanner.hasNextInt()){
			alter = scanner.nextInt();
		}
		scanner.nextLine();//clear all following input
		
		System.out.printf("Alter: %d", alter);
		
		System.out.printf("\n 's' eingeben>");
		String s = scanner.next();
		System.out.printf(s);

	}
}
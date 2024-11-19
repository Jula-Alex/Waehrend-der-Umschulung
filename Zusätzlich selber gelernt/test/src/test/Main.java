package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int pausa = 100;
		
		System.out.println("Inserisci una frase:");
		String frase = scanner.nextLine();
		char[] frase2 = frase.toCharArray();
		for (int i = 0; i < frase2.length; i++) {
			System.out.print(frase2[i]);
			try {
				Thread.sleep(pausa);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

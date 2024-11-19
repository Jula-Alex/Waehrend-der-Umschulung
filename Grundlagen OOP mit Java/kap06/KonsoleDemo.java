//kap06/KonsoleDemo.java
import java.io.Console;


public class KonsoleDemo {

	public static void main (String[] args) {
		Console console = System.console();
		
		if (console == null) {
			System.err.println("Kein Zugriff auf die Standardkonsole!");
			System.exit(-1); //Programm nicht normal beendet
		}
	
		console.printf("Bitte Ihr Alter eingeben>");
		String s = console.readLine();
		
		int alterInt = Integer.parseInt(s);
		console.printf("Alter: %d", alterInt);
		//double alterDoubl = Double.parseDouble(s);
	}
}
//kap06/AusgabeDatei3.java
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.IOException; // hat als Sub-Klasse FileNotFoundException
import java.io.FileNotFoundException;

public class AusgabeDatei3 {

	public static void main (String[] args) {
		
		try {
		//PrintWriter hat printf, FileWriter hat append
		PrintWriter ausgabe = new PrintWriter(new FileWriter("out3.txt", true));
		
		String ware = "Füller";
		double preis = 13.99;
		
		ausgabe.printf("1 %s kostet %.2f \u20AC\n", ware, preis);//Eurozeichen \u20AC
		
		ware = "Lineal";
		preis = 1.25;
		
		ausgabe.printf("1 %s kostet %.2f \u20AC\n", ware, preis);
		
		//Stream Close
		ausgabe.close();
		//Filter-Out Exceptions without following if-clause
		//As child FileNotFoundException should be put first
		} catch (FileNotFoundException e) {
			System.err.println("Fehler FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Fehler IOException: " + e.getMessage());
			//Alternatively, handle per if-clause the specific exception-type here
		}
	}
}

/*
	FileWriter è una sottoclasse di Writer progettata per scrivere direttamente su file di testo. È una classe che semplifica la scrittura di caratteri in un file.
	
	Principali caratteristiche:
    Scrittura su file di testo: Facilita la scrittura di stringhe o caratteri su un file.
    Costruzione semplice: Può essere utilizzata direttamente per scrivere caratteri in un file senza bisogno di gestire flussi di byte.
    Charset predefinito: Utilizza il charset predefinito della piattaforma, a meno che non venga specificato diversamente.
*/
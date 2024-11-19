//kap06/Ausgabe.java
import java.io.PrintStream;

public class Ausgabe {

	public static void main (String[] args) {
		
		//Überschreiben vom Feld System.out
		PrintStream ausgabe = new PrintStream(System.out);
		
		String ware = "Füller";
		double preis = 13.9956474654;
		
		ausgabe.printf("1 %s kostet %.2f \u20AC\n", ware, preis);//Eurozeichen \u20AC
		
		ware = "Lineal";
		preis = 1.253546564;
		
		ausgabe.printf("1 %s kostet %.2f \u20AC\n", ware, preis);
		
		//Stream Close
		ausgabe.close();
	}
}

/* 	PrintStream è una classe in Java, che appartiene al pacchetto java.io. Viene utilizzata per inviare output formattato a diverse destinazioni, come il terminale o un file. La classe PrintStream eredita dalla classe OutputStream e fornisce metodi per stampare tipi di dati primitivi e oggetti come stringhe, numeri, booleani, ecc.

	Uno degli esempi più comuni di un oggetto PrintStream in Java è il famoso System.out, che invia il testo di output al terminale (console). Infatti, System.out è un'istanza di PrintStream.
	Caratteristiche principali di PrintStream

    Output formattato: consente di stampare stringhe formattate utilizzando metodi come print() e println(), ma anche il più potente printf().
    Non genera eccezioni: A differenza di altre classi di output, i metodi di PrintStream non generano eccezioni IOException, anche se si verificano errori durante l'output.
    Autoflushing: Può essere configurato per eseguire il "flush" automaticamente dopo ogni scrittura di una nuova riga (con println()), assicurandosi che i dati siano effettivamente inviati all'output di destinazione.
	
	Conclusione

	PrintStream è una classe potente e comoda per gestire l'output di dati, fornendo un'ampia gamma di metodi per la formattazione e il controllo dell'output su varie destinazioni, come console, file o altre risorse di output.
*/
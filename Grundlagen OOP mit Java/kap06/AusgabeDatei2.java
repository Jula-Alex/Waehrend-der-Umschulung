//kap06/AusgabeDatei2.java
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class AusgabeDatei2 {

	public static void main (String[] args) {
		
		try {
		PrintWriter ausgabe = new PrintWriter("out2.txt"); //geht mit System.out auch  
		
		String ware = "Füller";
		double preis = 13.99;
		
		ausgabe.printf("1 %s kostet %.2f \u20AC\n", ware, preis);//Eurozeichen \u20AC
		
		ware = "Lineal";
		preis = 1.25;
		
		ausgabe.printf("1 %s kostet %.2f \u20AC\n", ware, preis);
		
		//Stream Close
		ausgabe.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fehler: " + e.getMessage());
		}
	}
}
 /*
	PrintWriter è una classe in Java, che appartiene al pacchetto java.io, progettata per scrivere testo formattato (come stringhe e dati primitivi) su un flusso di output, come file o socket, in modo efficiente. È simile a PrintStream ma con una differenza fondamentale: PrintWriter supporta il set di caratteri (charset), rendendolo preferibile quando si lavora con la codifica di testo, come UTF-8.

	Come PrintStream, PrintWriter fornisce metodi per scrivere stringhe, valori primitivi, e oggetti, con o senza formattazione. Tuttavia, è spesso utilizzato per garantire che i dati siano scritti come testo in modo corretto ed efficiente.
	Caratteristiche principali di PrintWriter

    Scrittura di testo: Consente di scrivere testo (e non byte), supportando anche diversi set di caratteri.
    Nessuna eccezione non controllata: I metodi di PrintWriter non generano eccezioni IOException durante la scrittura, simile a PrintStream.
    Supporto per l'autoflushing: Può essere configurato per eseguire il "flush" del contenuto bufferizzato dopo ogni nuova riga scritta, assicurando che i dati siano inviati immediatamente.
    Charset supportato: Permette di specificare il set di caratteri (es: UTF-8), il che lo rende preferibile quando la corretta gestione della codifica è fondamentale.
	
	Conclusione

	PrintWriter è uno strumento versatile per gestire l'output di testo in Java, con un supporto migliore per la codifica rispetto a PrintStream. È comunemente utilizzato per scrivere su file, socket o altre destinazioni di testo, con metodi comodi per la formattazione del testo e l'output strutturato.
*/
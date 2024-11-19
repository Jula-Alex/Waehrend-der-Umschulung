//kap06/ReaderDemo.java
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
Check this:
C:\Projekte\Java\kap06>javac *.java
ReaderDemo.java:15: Fehler: Nicht gemeldete Ausnahme IOException. Muss abgefangen oder deklariert werden, um ausgelöst zu werden
                String s = bufferedReader.readLine();
                                                  ^
1 Fehler

C:\Projekte\Java\kap06>javac *.java
ReaderDemo.java:22: Fehler: Nicht gemeldete Ausnahme IOException. Muss abgefangen oder deklariert werden, um ausgelöst zu werden
                String s = bufferedReader.readLine();
                                                  ^
1 Fehler

C:\Projekte\Java\kap06>javac *.java
ReaderDemo.java:11: Fehler: Nicht gemeldete Ausnahme IOException. Muss abgefangen oder deklariert werden, um ausgelöst zu werden
                einlesen();
                        ^
1 Fehler
*/

public class ReaderDemo {

	public static void main (String[] args) {
		try {
		einlesen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void einlesen() throws IOException {
			
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int alter = 0;
		
		String s;
		boolean fehler;
		double preis = 0.0;
		
		//Consider to use here Double.isNaN
		do {
			try {
				System.out.printf("Bitte Preis eingeben>");
				s = bufferedReader.readLine(); //readLine - Methode der BufferedReader
				s = s.replace(",", ".");
				preis = Double.parseDouble(s);
				fehler = false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				fehler = true;
			}
		} while (fehler);
		
		
		System.out.printf("Preis: %.2f", preis);
	}
}

/*
	Un InputStreamReader è una classe in Java che converte un flusso di byte in un flusso di caratteri. Serve a interpretare i dati binari (byte) e convertirli in testo leggibile (caratteri), secondo una specifica codifica di caratteri (come UTF-8 o ISO-8859-1).
	
	Caratteristiche principali:
    Convertitore di flussi: Converte un InputStream (flusso di byte) in un Reader (flusso di caratteri).
    Codifica: Può essere usato per gestire diverse codifiche di caratteri (ad esempio UTF-8, ASCII).
    Facilita la lettura di testo: È utile quando si leggono dati testuali da fonti binarie, come file o stream di rete.
	
	InputStreamReader: Serve a convertire byte in caratteri e a gestire la codifica di caratteri. Lavora direttamente con gli stream di byte (come InputStream).
*/

/*
	Un BufferedReader è una classe che serve a leggere dati da un Reader (ad esempio un FileReader o un InputStreamReader) in modo più efficiente, usando un buffer interno. È particolarmente utile per leggere testo da un file o da uno stream di input, linea per linea.
	
	Caratteristiche principali:
    Efficienza: Riduce il numero di accessi all'input stream grazie all'uso di un buffer interno.
    Lettura più facile: Fornisce il metodo readLine() per leggere intere linee di testo.
    Combina con altri Reader: Spesso viene utilizzato insieme a FileReader o InputStreamReader per rendere la lettura dei dati più efficiente.
	
	BufferedReader: Serve a migliorare l'efficienza della lettura di caratteri, raggruppando le operazioni di lettura in un buffer. Si usa tipicamente per leggere il testo linea per linea.
*/
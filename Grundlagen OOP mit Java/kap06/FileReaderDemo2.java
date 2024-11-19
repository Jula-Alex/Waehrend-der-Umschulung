//kap06/FileReaderDemo2.java
import java.io.*;
import java.lang.InterruptedException;

public class FileReaderDemo2 {

	public static void main (String[] args) {
		try {
			einlesen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void einlesen() throws IOException {
			
		FileReader eingabe = new FileReader("tuenia.txt");
	
		int zeichen;
		while ((zeichen = eingabe.read()) != -1) {
			try {
				System.out.println(Integer.toBinaryString(zeichen)); //Zeichen ist int-Number von ASCII-Tabellen Position des Symbols
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		eingabe.close();//Schließen, wenn File ausgelesen wird, oder nicht ausgelesen werden kann (Fehlerfall)
	}
}

/* 
	FileReader è una classe in Java utilizzata per leggere dati da un file di testo. È una specializzazione della classe InputStreamReader e serve per leggere caratteri da un file (anziché byte). Essendo una sottoclasse di Reader, si occupa di leggere flussi di caratteri, piuttosto che di byte, ed è quindi ideale per lavorare con file di testo.
	
	Caratteristiche principali:
    Semplicità: È progettata per leggere file di testo, carattere per carattere, oppure tramite buffer o intere righe (con l'aiuto di BufferedReader).
    Automatica gestione della codifica: La codifica predefinita dipende dalla piattaforma, ma può essere personalizzata usando un InputStreamReader insieme a una codifica specifica.
    Eredita da InputStreamReader: Internamente, FileReader utilizza un FileInputStream per leggere i byte dal file e poi convertirli in caratteri.

	Costruttori:
    FileReader(String fileName): Apre un file usando il nome del file.
    FileReader(File file): Apre un file usando un oggetto File.
	
	FileReader: È progettato per leggere caratteri da un file di testo. Ideale per lavorare con dati testuali.
*/
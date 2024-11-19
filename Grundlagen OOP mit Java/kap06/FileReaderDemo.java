//kap06/FileReaderDemo.java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main (String[] args) {
		try {
			einlesen4();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/* quando si usa throws nei metodi: o si deve gestire l'eccezione da chi chiama la funzione tramite try-catch oppure chi chiama la funzione aggiunge a sua volta throws cosi la gestione dell'eccezione verra' rimandata a colui che chiama la funzione in causa finche alla fine si arriva al sistema operativo... */ 
	
	public static void einlesen() throws IOException {
			
		BufferedReader eingabe = new BufferedReader(new FileReader("FileReaderDemo.java"));
		
		String zeile;
		
		while ((zeile = eingabe.readLine()) != null) {
			System.out.println(zeile);
		}
		
		eingabe.close();//Schließen, wenn File ausgelesen wird, oder nicht ausgelesen werden kann (Fehlerfall)
		
	}
	
	public static void einlesen2() throws IOException {
			
		BufferedReader eingabe = new BufferedReader(new FileReader("FileReaderDemo.java"));
		
		String zeile;
		char[] brio;
		
		while ((zeile = eingabe.readLine()) != null) {
			brio = zeile.toCharArray();
			try {
				for (char c : brio) {
					System.out.print(c);
					Thread.sleep(10);
				}
			} catch (Exception e) {
				System.out.println("Fatal Error!!!");
			}
			System.out.println();
			//System.out.println(zeile);
		}
		
		eingabe.close();//Schließen, wenn File ausgelesen wird, oder nicht ausgelesen werden kann (Fehlerfall)
		
	}
	
	public static void einlesen3() throws IOException {
			
		FileReader eingabe = new FileReader("FileReaderDemo.java");
		
		int zeile;
		
		while ((zeile = eingabe.read()) != -1) {
			try {
				System.out.print((char) zeile); 
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		eingabe.close();//Schließen, wenn File ausgelesen wird, oder nicht ausgelesen werden kann (Fehlerfall)
		
	}
	
	public static void einlesen4() throws IOException {
			
		BufferedReader br = new BufferedReader(new FileReader("FileReaderDemo.java"));
		
		String uno = br.readLine();
		
		System.out.println(uno);
		
		String due = br.readLine();
		
		System.out.println(due);
		
		String tre = br.readLine();
		
		System.out.println(tre);
		
		String quattro = br.readLine();
		
		System.out.println(quattro);
		
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

/*
	Un BufferedReader è una classe che serve a leggere dati da un Reader (ad esempio un FileReader o un InputStreamReader) in modo più efficiente, usando un buffer interno. È particolarmente utile per leggere testo da un file o da uno stream di input, linea per linea.
	
	Caratteristiche principali:
    Efficienza: Riduce il numero di accessi all'input stream grazie all'uso di un buffer interno.
    Lettura più facile: Fornisce il metodo readLine() per leggere intere linee di testo.
    Combina con altri Reader: Spesso viene utilizzato insieme a FileReader o InputStreamReader per rendere la lettura dei dati più efficiente.
	
	BufferedReader: Serve a migliorare l'efficienza della lettura di caratteri, raggruppando le operazioni di lettura in un buffer. Si usa tipicamente per leggere il testo linea per linea.
*/

/* 
	In sintesi, FileReader è una classe fondamentale per leggere file di testo in Java e può essere combinata con altre classi come BufferedReader per ottenere una maggiore efficienza e semplicità di utilizzo.
*/
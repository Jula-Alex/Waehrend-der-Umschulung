// Aufgaben/bank/Kunde.java
package ctc.customer;
import ctc.bank.Konto;

public class Kunde {
	public static int nextId = 1;
	private int id;
	private String vorname;
	private String nachname;
	
	private Konto[] konten;
	private int index;

	public Kunde(String vorname, String nachname) {
		id = nextId++;
		this.vorname = vorname;
		this.nachname = nachname;
		konten = new Konto[5];
		index = -1;
	}
	
	public void zeigeKonten() {
		System.out.println("Konten-Übersicht für " + this);
		for (Konto k: konten) {
			System.out.println(k);
		}
	}
	
	public void add(Konto k) {
		if (index < konten.length - 1) {
			konten[++index] = k;
		}
	}
	
	@Override
	public String toString() {
		return vorname + " " + nachname;
	}
}
// Aufgaben/bank/Bank.java
/*
package ctc;
import ctc.bank.Giro;
import ctc.bank.Sparbuch;
import ctc.bank.Verzinsbar;
import ctc.customer.Kunde;
*/

public class Bank {

	public static void main (String[] args) {
		
		Kunde k1 = new Kunde("Dennis", "Baumgärtner");
		Kunde k2 = new Kunde("Andreas", "Kalenteridis");
		
		// Assoziation: Konto gehört Kunde
		Giro g1 = new Giro(1000, k1, 1000);
		Sparbuch s1 = new Sparbuch(500, k2);
		
		k1.zeigeKonten();
		k2.zeigeKonten();
		
		g1.drucken();
		s1.drucken();
		g1.auszahlen(5000);
		s1.auszahlen(1000);
		g1.drucken();
		s1.drucken();
		g1.ueberweisen(2000, s1);
		System.out.println(g1);
		System.out.println(s1);
		System.out.println();
		
		System.out.println("\nZinsen fallen an.");
		addZins(g1);
		addZins(s1);
		
		g1.drucken();
		s1.drucken();
		System.out.println();
		
	}
	
	public static void addZins(Verzinsbar v) {
		v.verzinsen();
	}
}
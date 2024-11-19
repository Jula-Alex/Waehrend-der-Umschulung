// Aufgaben/bank/Konto.java
package ctc.bank;
import ctc.customer.Kunde;

//Konto ist abstract, weil Konto selber verzisbar() nicht implementiert. 
//Nicht alle Konten sind gleich verzinsbar !
//Die Kinder von Konto werden dann die spezifische Verzinsung des Konto-Typs implementieren. 
public abstract class Konto implements Verzinsbar {
	
	public static int nextKtoNr = 430001;
	private int ktoNr;
	/*protected*/ private double saldo;
	private Kunde inhaber;
	private double habenZinssatz;
	
	public Konto(double saldo, Kunde inhaber) {
		this.ktoNr = nextKtoNr;
		nextKtoNr += 11;
		this.saldo = saldo;
		this.inhaber = inhaber;
		this.inhaber.add(this);
		habenZinssatz = 1.5;
	}
	
	public Konto() {
		this.ktoNr = nextKtoNr;
		nextKtoNr += 11;
		saldo = 0;
		inhaber = null;
	}
	
	public void einzahlen(double betrag) {
		if (betrag > 0) {
			saldo += betrag;
		}
	} 

	public boolean auszahlen(double betrag) {
		if (betrag > 0) {
			saldo -= betrag;
			
			return true;
		} 
		return false;
	} 
	
	public void drucken() {
		System.out.println(getClass().getSimpleName());		
		
		System.out.println("Kontonummer: " + ktoNr);
		System.out.println("Inhaber: " + inhaber);
		System.out.println("Saldo: " + saldo);
		
	}
	
	public boolean ueberweisen(double betrag, Konto zielKonto) {
		
		boolean ok = /*this.*/auszahlen(betrag);
		
		if (ok) {
			zielKonto.einzahlen(betrag);
		}
		return ok;
		
		/*Alternativ (Da auszahlen(betrag) 0 oder 1 zurückgibt:
		if (auszahlen(betrag)) {
			zielKonto.einzahlen(betrag);
			return true;
		}
		return false;
		*/
	}
	/**
	Typische Get-Methode
	@return gibt den <b>Saldo</b> zurück
	*/
	public double getSaldo() {
		return saldo;
	}
	
	public double getHabenZinssatz() {
		return habenZinssatz;
	}
	
	public void add(double betrag) {
		saldo += betrag;
	}
	
	//Override darf keine niedrigeren Zugriffsberechtigungen haben
	// hier: public
	@Override
	public String toString() {
		return getClass().getSimpleName() + " (" + ktoNr + ", " + inhaber + ")";
	}
	
	
}
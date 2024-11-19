// Aufgaben/bank/Giro.java
package ctc.bank;
import ctc.customer.Kunde;

public class Giro extends Konto{
	
	private int limit;
	private double sollZinssatz;
	
	public Giro(double saldo, Kunde inhaber, int limit) {
		super(saldo, inhaber);
		this.limit = limit;
		sollZinssatz = 10.0;
	}
	//wenn nicht zufrieden, dann override
	@Override
	public boolean auszahlen(double betrag) {
		if(getSaldo() - betrag >= -limit) {
			return super.auszahlen(betrag);
		}
		System.out.println("Auszahlung verweigert!");
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " L: " + limit;
	}
	
	@Override
	public void verzinsen() {
		if (getSaldo() >= 0.0) {
			add(getSaldo() * getHabenZinssatz() / 100.0);
		} else {
			add(getSaldo() * sollZinssatz / 100.0);
		}
	}
	
}
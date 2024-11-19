// Aufgaben/bank/Sparbuch.java
package ctc.bank;
import ctc.customer.Kunde;

public class Sparbuch extends Konto {
	
	public Sparbuch(double saldo, Kunde inhaber) {
		super(saldo, inhaber);
	}
	
	@Override
	public boolean auszahlen(double betrag) {
		if(getSaldo() >= betrag) {
			return super.auszahlen(betrag);
		}
		System.out.println("Sparbuch weist den gewünschten Betrag nicht auf");
		return false;
	}
	
	@Override
	public void verzinsen() {
		add(getSaldo() * getHabenZinssatz() / 100.0);
	}
}
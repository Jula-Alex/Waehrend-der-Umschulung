//2019_W_FIAT_GA1 - Aufgabe 3b (Ladegerät)
// Aufgaben/ladevorgang/Ladegeraet.java

public class Ladegeraet {
	
	//Aggregation von Zustand
	//d.h. Ladegerät hat Zustand
	private Zustand zustand;
	private int ladestand;
	
	public Ladegeraet() {
		zustand = NichtLadend.getNichtLadend();
		//initialisieren
		ladestand = 50;
		System.out.println("ladestand: " + ladestand);
	}
	
	public void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}
	
	public int getLadestand() {
		return ladestand;
	}
	
	public void ausloesen() {
		zustand.bearbeiten(this);
	}
}
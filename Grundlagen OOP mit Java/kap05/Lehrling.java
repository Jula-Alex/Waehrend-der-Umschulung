// kap05/Lehrling.java

public class Lehrling extends Mitarbeiter {
	
	private int abgelegtePruefungen = 0;
	
	public Lehrling(String vorname, String nachname, double gehalt) {
		super(vorname, nachname, gehalt);
	}
	
	@Override
	//Lehrling bekommt nur 20% Gehaltserhöhung
	public void erhoeheGehalt(double zuschlag) {
		super.erhoeheGehalt(0.2 * zuschlag);
	}
}
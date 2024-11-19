// Aufgaben/geometrie3/Rechteck.java

public class Rechteck extends Shape {
	
	private double laenge;
	private double breite;
	
	public Rechteck(String farbe, double laenge, double breite) {
		super(farbe);
		this.laenge = laenge;
		this.breite = breite;	
	}
	
	@Override
	public double getFlaeche() {
		return laenge * breite;
	}
}
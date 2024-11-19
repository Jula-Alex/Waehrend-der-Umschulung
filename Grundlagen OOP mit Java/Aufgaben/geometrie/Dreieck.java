// Aufgaben/geometrie3/Dreieck.java

public class Dreieck extends Shape {
	
	private double basis, hoehe;
	
	public Dreieck(String farbe, double basis, double hoehe) {
		super(farbe);
		this.basis = basis;
		this.hoehe = hoehe;
	}
	
	//Das muss hier IMMER definiert werden, da die SUPER-Klassen-Methode abstract ist
	//Dreieck-Klasse kann auch abstract sein, 
	//dann wird man sie aber nicht instanziieren können
	@Override
	public double getFlaeche() {
		return 0.5 * basis * hoehe;
	}
}
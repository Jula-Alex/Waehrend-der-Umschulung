// Aufgaben/geometrie3/Ring.java

public class Ring extends Kreis{
	
	private double innenradius;
	
	public Ring(String farbe, double radius, double innenradius) {
		//Das ist hier Konstruktor - kommt zuerst
		super(farbe, radius);
		//das ist jetzt Zuweisung - 
		//Zuweisung und Methoden kommen nach KOnstruktor sonst ist Objekt nicht da
		this.innenradius = innenradius;
	}
	
	@Override
	public double getFlaeche() {
		return super.getFlaeche() - (Math.pow(innenradius,2) * Math.PI);
	}
}
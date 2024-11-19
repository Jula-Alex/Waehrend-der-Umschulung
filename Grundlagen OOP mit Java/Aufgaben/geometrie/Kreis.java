//Aufgaben/geometrie3/Kreis.java


// Kreis ist ein Shape
public class Kreis extends Shape {
	
	private double radius;
	
	public Kreis(String farbe, double radius) {
		super(farbe);
		this.radius = radius;	
	}
	
	@Override
	public double getFlaeche() {
		return Math.pow(radius,2) * Math.PI;
	}
}
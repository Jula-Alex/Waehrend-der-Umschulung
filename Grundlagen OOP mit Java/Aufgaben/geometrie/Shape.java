//Aufgaben/geometrie3/Shape.java

//Abstract Class - im Falle von abstracten methoden
public abstract class Shape {
	private String farbe;
	
	public Shape(String farbe) {
		this.farbe = farbe;		
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	protected void setFarbe(String farbe) {
		this.farbe = farbe;
	}

/*	
	//keine abstrakte Methode ist schlecht
	public double getFlaeche(){
		return 0;
	}
*/	
	//Ohne body
	public abstract double getFlaeche();

	@Override
	public String toString() {
		return farbe + getClass().getName();
	}
	
	//Statische Methode kann auch hier sein
	/*
	public static void ligth(Shape s) {
		s.setFarbe("hell"+s.getFarbe());
	}
	*/
	
	//Variante mit farbe und ohne parameter

	public void ligth() {
		farbe="hell"+farbe;
	}

}
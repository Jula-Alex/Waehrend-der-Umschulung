// Aufgaben/geometrie/Geometrie.java

import java.util.Locale;

public class Geometrie {
	
	public static void main (String[] args) {
		
		Kreis blauKreis = new Kreis("blau", 6.0);
		Ring gruenRing =  new Ring("gruen", 10.0, 3.0);
		Rechteck gelbRechteck = new Rechteck("gelb", 14.0, 10.0);
		
		System.out.println(blauKreis.getClass().getName() + " farbe: " + blauKreis.getFarbe());
		System.out.printf(Locale.US,"Fläche: %.2f\n", blauKreis.getFlaeche());//print formated
		
		System.out.println(gruenRing.getClass().getName() + " farbe: " + gruenRing.getFarbe());
		System.out.printf(Locale.US,"Fläche: %.2f\n", gruenRing.getFlaeche());//print formated
		
		System.out.println(gelbRechteck.getClass().getName() + " farbe: " + gelbRechteck.getFarbe());
		System.out.printf(Locale.US,"Fläche: %.2f\n", gelbRechteck.getFlaeche());//print formated

		
//		Shape[] shapes = new Shape[4];
		
		// new Shape("blaumetallic"); ist NICHT möglich, da Shape abstract ist
/*		
		shapes[0] = new Rechteck("gelb", 14.0, 10.0);
		shapes[1]  = new Kreis("blau", 6.0);
		shapes[2]  = new Ring("gruen", 10.0, 3.0);
		shapes[3]  = new Dreieck("rot", 12.0, 8.0);
		
		for (Shape s : shapes) {
			System.out.println(s);
		}
		
		double gesamtFlaeche = 0.0;
		
		for (Shape s : shapes) {
			gesamtFlaeche += s.getFlaeche();
		}
		
		System.out.println("Gesamtfläche: " + gesamtFlaeche);
*/
	}
}
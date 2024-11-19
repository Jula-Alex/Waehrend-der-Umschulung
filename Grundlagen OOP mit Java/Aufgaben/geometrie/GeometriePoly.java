// Aufgaben/geometrie/GeometriePoly.java

import java.util.Locale;

public class GeometriePoly {
	
	public static void main (String[] args) {

/*		
		Kreis blauKreis = new Kreis("blau", 6.0);
		Ring gruenRing =  new Ring("gruen", 10.0, 3.0);
		Rechteck gelbRechteck = new Rechteck("gelb", 14.0, 10.0);
		
		System.out.println(blauKreis.getClass().getName() + " farbe: " + blauKreis.getFarbe());
		System.out.printf(Locale.US,"Fläche: %.2f\n", blauKreis.getFlaeche());//print formated
		
		System.out.println(gruenRing.getClass().getName() + " farbe: " + gruenRing.getFarbe());
		System.out.printf(Locale.US,"Fläche: %.2f\n", gruenRing.getFlaeche());//print formated
		
		System.out.println(gelbRechteck.getClass().getName() + " farbe: " + gelbRechteck.getFarbe());
		System.out.printf(Locale.US,"Fläche: %.2f\n", gelbRechteck.getFlaeche());//print formated
*/

/*
		new Shape("weiss");
		---Ergebnis da Classe abstract ist---
		C:\Projekte\Java\Aufgaben\geometrie3>javac *.java
GeometriePoly.java:23: Fehler: Shape ist abstrakt, kann nicht instanziiert werden
                new Shape("weiss");
		
*/
		Shape[] shapes = new Shape[4];
		
		shapes[0] = new Kreis("blau", 6.0);
		shapes[1] = new Ring("gruen", 10.0, 3.0);
		shapes[2] = new Rechteck("gelb", 14.0, 10.0);
		shapes[3] = new Dreieck("rot", 8.0, 5.0);
		
		//set color of Kreis to light-blue. Abstract Class can be used as parameter.
		GeometriePoly.ligth(shapes[0]);
		
		for (Shape s : shapes) {
			System.out.println(s.getClass().getName() + " farbe: " + s.getFarbe());
			
			//System.out.printf(Locale.US,"Fläche: %.2f\n", s.getFlaeche());

//Alternative 1 mit Casting, siehe auch Mitarbeiter
/*			
			try {
				((Kreis) s).getFarbe();
			//We may catch also the specific exception ClassCastException
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage() + "\nExceptionCause: " + e.getCause());
			}
*/

//Alternative 2 mit abstract
			System.out.printf(Locale.US,"Fläche: %.2f\n", s.getFlaeche());
		}
		
		System.out.println("### Alle Farben hell");
		for (Shape s : shapes) {
			s.ligth();
			System.out.println(s.getClass().getName() + " farbe: " + s.getFarbe());
			
			//System.out.printf(Locale.US,"Fläche: %.2f\n", s.getFlaeche());

//Alternative 1 mit Casting, siehe auch Mitarbeiter
/*			
			try {
				((Kreis) s).getFarbe();
			//We may catch also the specific exception ClassCastException
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage() + "\nExceptionCause: " + e.getCause());
			}
*/

//Alternative 2 mit abstract
			System.out.printf(Locale.US,"Fläche: %.2f\n", s.getFlaeche());
		}
	}
	
	/**
	* method ligth - static ist wegen main, d.h. Einstiegspunkt
	*  static bei Methoden

Ähnlich den Klassenvariablen kann auch auf static deklarierte Methoden (Klassenmethoden) ohne Objektbildung zugegriffen werden. Aus anderen statischen Umgebungen heraus können sie direkt mit dem vorangestellten Klassennamen aufgerufen werden. Umgekehrt müssen alle Methoden selbst static sein, die innerhalb einer static deklarierten Umgebung direkt aufgerufen werden sollen. 
	*/
	public static void ligth(Shape s) {
		s.setFarbe("hell"+s.getFarbe());
	}
}
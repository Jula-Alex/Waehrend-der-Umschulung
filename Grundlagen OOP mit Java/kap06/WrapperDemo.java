//kap06/WrapperDemo.java

//WrapperDemo - Hüll-Klassen
//Klasses für primitive types - Byte, Integer, Double, usw.
/*
boolean	Boolean		-------------> 1 	Bit
byte	Byte    	-------------> 1 	Byte
char	Character	-------------> 2	Byte
short	Short		-------------> 2 	Byte
int		Integer		-------------> 4 	Byte
float	Float		-------------> 4	Byte
long	Long		-------------> 8	Byte
double	Double	   	-------------> 8	Byte
*/
public class WrapperDemo {

	public static void main (String[] args) {
	
		//Beispiel für "deprecated"
		int zahl = 42;
		/*
		C:\Projekte\Java\kap06>javac -deprecation *.java
WrapperDemo.java:21: Warnung: [removal] Integer(int) in Integer ist veraltet und wurde zum Entfernen markiert
                Integer ref = new Integer(zahl); //deprecated
		*/
		//Integer ref = new Integer(zahl); //deprecated
		Integer ref = Integer.valueOf(zahl);
		System.out.println(ref);
		
		ref = 23; //Autoboxing - Java konvertiert einen int-Wert in ein Integer-/String-Objekt
		System.out.println(ref);

		//Zahlen Erkenner
		String eingabe = " -35 ";
		zahl = Integer.parseInt(eingabe.trim());
		
		System.out.println(zahl);

		
	}
}


// kap04/Kontrollstrukturen.java

//File name should correspond the class name
public class Kontrollstrukturen {
	public static void main(String[] args) {
		
		int a = 17, b = 4;
		
		//Verzweigung - Vorsicht: Typecasting und "=" und "=="
		if (a == b)
		{
			System.out.println("a und b sind gleich");
		} else {
			System.out.println("a und b sind ungleich");
		}
		
		//Vorsicht: s ist Referenz auf Klasse-String
		String s; // ist nicht null sondern nur eine Referenz aber erstellt wurde NICHTS
		s = null; // jetzt ist mit null Initialisiert
		s = "JA"; 
		//Auswahl
		
		System.out.println("Ihre Antwort ist: ");
		switch(s){
			case "OK": 
				System.out.println("OK");
				break;
			case "Cancel": 
				System.out.println("Cancel");
				break;
			default:
				System.out.println("Other option");	
		}
		
		System.out.println("----------------------------------------------------");
		
		//Alternative SWITCH Notation bei einzeln Einweisungen	
		//Mit dem Pfeil break ist implizit
		System.out.println("Ihre Antwort ist: ");
		switch(s){
			case "OK" -> System.out.println("OK");
			case "Cancel" -> System.out.println("Cancel");
			default -> System.out.println("Other option");	
		}
		
		s = "OK";
		//Alternative SWITCH Notation bei einzeln Einweisungen	
		System.out.println("Ihre Antwort ist: ");
		switch(s){
			case "OK" -> 
			{
				System.out.println("OK - 3rd alt");
				System.out.println("second command here");
			}
			case "Cancel" -> System.out.println("Cancel");
			default -> System.out.println("Other option");	
		}
		
	}
}
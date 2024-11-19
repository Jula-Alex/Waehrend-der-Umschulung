// kap04/Kommandozeile.java

//File name should correspond the class name
public class Kommandozeile {
	public static void main(String[] args) {
		System.out.println("Anzahl der übergebene Parameter: " + args.length);
		
		for (String s: args) {
			System.out.println(s);
		}
	}
}
//kap06/StringBuilderDemo.java

//StringBuilderDemo ist mutable - Besser für Manipulation von Strings mit einem Objekt
public class StringBuilderDemo {

	public static void main (String[] args) {

			StringBuilder builder = new StringBuilder("HellloWelt");
			// builder.trimToSize();
			System.out.println("Builder Capacity: " + builder.capacity());
			
			
			//Zeichen am Ende einfügen
			builder.append('!');
			System.out.println(builder);
			
			//Zeichen einfügen
			builder.insert(builder.indexOf("W"), ' ');
			System.out.println(builder);
			
			//Zeichen löschen
			builder.delete(builder.indexOf("l"), builder.indexOf("l")+1);
			System.out.println(builder);
			
			
			String s = builder.toString();
			System.out.println("Questo arriva dalla Stringa s: " + s);
			System.out.println("Questo arriva dal Builder builder: " + builder);
			
			//Clear the String-Buffer inside the StringBuilder with "builder.setLength(0)"
			//Capacity remains
			builder.setLength(0);
			System.out.println("'builder' is now: '" + builder + "'");
			System.out.println("Builder Capacity: " + builder.capacity());
			
			//reduce size/capacity
			builder.trimToSize();
			System.out.println("trimToSize Builder Capacity: " + builder.capacity());
			
			System.out.println("Spruch: " + builder.append("Ein Esel lese nie"));
			System.out.println("Reverce Spruch: " + builder.reverse());

	}
}


package squakyCleanModified;

import java.util.Arrays;

class SqueakyClean {
	static String clean(String identifier) {
		// Task 1 Replace any spaces encountered with underscores
		identifier = identifier.replace(" ", "_");
		// Task 2 and Task 3: Convert kebab-case to camelCase and Convert LeetSpeak to
		// normal text
		String[] parts = identifier.split("-");
		
		// First word remains LowerCase
		StringBuilder camelCase = new StringBuilder();
		String stringaProvisoria;

		for (int i = 0; i < parts.length; i++) {
			stringaProvisoria = parts[i]
											   .replace("0", "o").replace("1", "i")
											   .replace("3", "e").replace("4", "a")
											   .replace("5", "s").replace("7", "t");
			if (i == 0) {
				camelCase.append(stringaProvisoria.toLowerCase());				
			} else {
				camelCase.append(Character.toUpperCase(stringaProvisoria.charAt(0)))
				.append(stringaProvisoria.substring(1));
			}
		}
		
		// Task 4
		// I take what in camelCase is and i put it in the stringaProvisoria
		stringaProvisoria = camelCase.toString();
		
		// I delete all the content in camelCase
		camelCase.delete(0, camelCase.length());
		// or camelCase.setLength(0); that cleared the StringBuilder too

		// I filter the provisoryString and I append it again to camelCase
		// Keeps letters and underscores
		boolean nextUpperCase = false;
		for(char c : stringaProvisoria.toCharArray()) {
			if(Character.isLetter(c)) {
				if(nextUpperCase) {
					camelCase.append(Character.toUpperCase(c));
					nextUpperCase = false;
				} else {
					camelCase.append(c);
				}
			} else if(c == '_') {
				camelCase.append(c);
				nextUpperCase = true;
			}
		}
		
		stringaProvisoria = camelCase.toString();
		camelCase.setLength(0);
		for(int i = 0; i < stringaProvisoria.length(); i++) {
			char c = stringaProvisoria.charAt(i);
			if(Character.isLetter(c)) {
				camelCase.append(stringaProvisoria.substring(0, i) + Character.toLowerCase(c) + stringaProvisoria.substring(i + 1));
				break;
			}
		}
		
		identifier = camelCase.toString();
		return identifier;
	}
}

public class Main {

	public static void main(String[] args) {
//		SqueakyClean test = new SqueakyClean(); because is static you don't need an Instance of the class
		System.out.println(SqueakyClean.clean("   this-is-a-kebab-case-transformed-in-camel-case "));
		System.out.println(SqueakyClean.clean("   7h15-15-4-k3b4b-c453-w17h-l337-5p34k-cl34n3d-4nd-7r4n5f0rm3d-1n-c4m3l-c453 "));
		System.out.println(SqueakyClean.clean("     4ll- 7h3-5ymbo%ls- w1ll% d1s4!&p34r 1f§-7h\"3-program-work-properly "));
		System.out.println(SqueakyClean.clean("A"));
	}

}

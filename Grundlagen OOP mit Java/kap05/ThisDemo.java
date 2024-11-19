// kap05/ThisDemo.java

public class ThisDemo {
	
		public static void main(String[] args) {
			WerBinIch ego = new WerBinIch(1);
			WerBinIch tu = new WerBinIch(0);
			
			System.out.println("von aussen: " + ego);
			System.out.println("von aussen: " + tu);
			
			ego.ichBin();
			tu.ichBin();
		}
}

class WerBinIch {
	
	private int irgendwas;
	
	WerBinIch (int irgendwas){
		//lokale Überdeckung meine irgendwas ("private int irgendwas") bekommt die Zuweisungswert von "WerBinIch (int irgendwas)"
		this.irgendwas = irgendwas;
	}
	
	void ichBin() {
		//this: Referenz auf die eigene Instanz
		System.out.println("von innen: " + this);
	}
}
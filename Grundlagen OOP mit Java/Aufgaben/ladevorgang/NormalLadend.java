//2019_W_FIAT_GA1 - Aufgabe 3b (Ladegerät)
// Aufgaben/ladevorgang/NormalLadend.java

public class NormalLadend extends Zustand {
	
	private static NormalLadend normalLadend;
	
	private NormalLadend() {
		System.out.println("Constructor.NormalLadend");
	}
	
	public static NormalLadend getNormalLadend(){
		if (normalLadend == null) {
			normalLadend = new NormalLadend();
		}
		return normalLadend;
	}
	
	@Override
	public void bearbeiten(Ladegeraet ladegeraet){
		
	}
}
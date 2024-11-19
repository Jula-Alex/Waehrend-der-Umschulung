//2019_W_FIAT_GA1 - Aufgabe 3b (Ladegerät)
// Aufgaben/ladevorgang/NichtLadend.java

public class NichtLadend extends Zustand {
	
	private static NichtLadend nichtLadend;
	
	private NichtLadend() {
		System.out.println("Constructor.NichtLadend");
	}
	
	public static NichtLadend getNichtLadend(){
		if (nichtLadend == null) {
			nichtLadend = new NichtLadend();
		}
		return nichtLadend;
	}
	
	@Override
	public void bearbeiten(Ladegeraet ladegeraet){
		int ladestand = ladegeraet.getLadestand();
		if ((ladestand >= 20) && (ladestand < 100)){
			ladegeraet.setZustand(NormalLadend.getNormalLadend());
		}
	}
}
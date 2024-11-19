package spielerei;

public class Main {

	public static void main(String[] args) {
		int[] x1 = new int[5];
//		x[0] = 1;
//		x[1] = 2;
//		x[2] = 3;
//		x[3] = 4;
//		x[4] = 5;
//		System.out.println(x1);
//		for(int i = 0; i < x1.length; i++) {
//			System.out.print(" " + x1[i]);
//		}
		
		int bodyParts = 6;
		int[] x2 = new int[10]; 
		int[] y = new int[10]; 
		
		for(int i = bodyParts; i > 0; i--) {
			x2[i] = x2[i-1];
			y[i] = y[i-1];
			System.out.print(x2[i] + " ");
		
//			System.out.print(y[i] + " ");
		}

	}

}

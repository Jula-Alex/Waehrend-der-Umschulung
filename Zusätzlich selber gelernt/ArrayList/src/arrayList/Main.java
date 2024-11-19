package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creo la lista di Interi
		ArrayList<Integer> numeri = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// aggiungo numeri interi alla lista
		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		numeri.add(4);
		numeri.add(5);
		numeri.add(5);
		numeri.add(7);
		numeri.add(8);
		numeri.add(9);
		numeri.add(10);
		
		numeri.set(5, 6);
		int get1 = numeri.get(5);
		System.out.println(get1);
		System.out.println(numeri.get(6));

		// stampo a schermo tutti i numeri come Array
		System.out.println("ArrayList: " + numeri);

		// iterazione tramite for-loop
		System.out.print("Numeri con for-loop: ");
		for (int i = 0; i < numeri.size(); i++) {
			System.out.print(numeri.get(i) + " ");
		}

		/* iterazione tramite for-each, la sintassi e' la seguente: Tipo degli elementi;
		 elemento e' la variabile in cui verra messo ogni singolo dato della
		 collezione nel iteraggio, si potrebbe dire che elemento e' simile a "i" del
		 ciclo for; poi rimane : collezione che sarebbe della collezione: for (Tipo
		 elemento : collezione) quindi per ogni Tipo nella variabile(elemento) della
		 collezione(Array o ArrayList o collezione etc) esgui il seguente blocco di
		 codice{}*/
		System.out.print("\nNumeri con for-each: ");
		for (Integer num : numeri) {
			System.out.print(num + " ");
		}

		// iterazione tramite Iterator<> che e' possibile solo tramite while e lo si fa
		// quando si vuole avere controllo sull'iterazione come per esempio rimuovere
		// elementi dalla collezione, lista, array etc.
		Iterator<Integer> iteriamo = numeri.iterator(); // si crea l'iteratore per la ArrayList numeri
		System.out.print("\nNumeri con Iterator<>: ");
		while (iteriamo.hasNext()) { // hasNext() verifica se ci sono ancora elementi nelle collezione da attraversare
			Integer elemento = iteriamo.next();
			// una cosa molto strana che ancora non la capisco e' che se non aggiungo else non funziona 
			if(elemento.equals(4)) {
				iteriamo.remove(); // il numero 4 verra rimosso 
			} else {
				System.out.print(elemento + " "); // next() restituisce l'elemento successivo nella collzione durante ogni iterazione
			}												 
		}
		 
		// verifico se la lista contiene uno specifico numero 
		System.out.println("\n" + numeri.contains(10));
		System.out.println(numeri.contains(11));
		Integer[] array = numeri.toArray(new Integer[0]); 
		
		System.out.println(array); // questa mostra l'indirizzo di memoria a cui e' salvato il dato
		System.out.println(Arrays.toString(array));
		
		System.out.println();
		// iterazione con ciclo for, da notare che al array la lunghezza si mostra con length e non con size()
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (Integer ciccio : array) {
			System.out.print(ciccio + " ");
		}
		
		System.out.println();
		// Iterator<Integer> iteratore = array.length; Iterator non si puo usare su un Array, solo su liste o collezioni che implementano l'interfaccia Collection
		// per poter iterare un array con Iterator bisogna trasformare il Array in una lista 
		List<Integer> lista = Arrays.asList(array); 
		Iterator<Integer> iteratore = lista.iterator();
		while(iteratore.hasNext()) {
			System.out.print(iteratore.next() + " ");
		}
		
		System.out.println("Scrivi piu parole: ");
			String parole = scanner.nextLine();
			System.out.println(parole);
			parole = scanner.nextLine();
			
			parole = scanner.nextLine();
			
			parole = scanner.nextLine();
			System.out.println(parole);
		
		
		
	}

}

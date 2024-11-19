package jOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/*
		 * JOptionPane pop up a standard dialog box that prompts user for a value or
		 * informs them of something
		 */

		// I tipi di finestre che puoi selezionare sono 5: Normale, Informativo, Interogativo, Attenzione, Errore
//		JOptionPane.showMessageDialog(null, "This is the normal PLAIN_MESSAGE", "qui va il titolo", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is the INFORMATION_MESSAGE", "qui va il titolo", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is the QUESTION_MESSAGE", "qui va il titolo", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is the WARNING_MESSAGE", "qui va il titolo", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is the ERROR_MESSAGE", "qui va il titolo", JOptionPane.ERROR_MESSAGE);
//		
//		// I tipi di finestre con bottoni sono 3: si_no_anulla; si_no; si
//		// Nota che per ogni bottone c'e un return di un intero: 0, 1, 2, -1 con cui puoi combinare i stati if
//		// Usa System.out.println per verificare il numero
//		System.out.println(JOptionPane.showConfirmDialog(null, "This is the normal PLAIN_MESSAGE", "qui va il titolo",                                                                                 				JOptionPane.YES_NO_CANCEL_OPTION));
//		JOptionPane.showConfirmDialog(null, "This is the normal PLAIN_MESSAGE", "qui va il titolo", JOptionPane.YES_NO_CANCEL_OPTION);
//		JOptionPane.showConfirmDialog(null, "This is the INFORMATION_MESSAGE", "qui va il titolo", JOptionPane.YES_NO_OPTION);
//		JOptionPane.showConfirmDialog(null, "This is the QUESTION_MESSAGE", "qui va il titolo", JOptionPane.YES_OPTION);
//		
//		// I tipi di finestre con input 
//		JOptionPane.showInputDialog(null, "This is the normal PLAIN_MESSAGE", "qui va il titolo", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showInputDialog(null, "This is the INFORMATION_MESSAGE", "qui va il titolo", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showInputDialog(null, "This is the QUESTION_MESSAGE", "qui va il titolo", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showInputDialog(null, "This is the WARNING_MESSAGE", "qui va il titolo", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showInputDialog(null, "This is the ERROR_MESSAGE", "qui va il titolo", JOptionPane.ERROR_MESSAGE);
//		
//		String name = JOptionPane.showInputDialog("What is your name ? ");
//		System.out.println("Hello " + name);
		
		// Questo tipo combina tutto in una sola finestra
		ImageIcon icon = new ImageIcon("small-smile.png");
		String[] options = {
				"First Option", 
				"Second Option", 
				"Third Option", 
				"And so on.."
		};
		JOptionPane.showOptionDialog(null, "Questa e' la finestra che puo essere personalizzata", "Titolo", 							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon, options, 0);
		
	}

}

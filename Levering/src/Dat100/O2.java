package Dat100;
import static java.lang.Integer.parseInt; 
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;
public class O2 {
	public static void main(String[] args) {
		boolean riktig =false;
		final int x = 10;
		for (int i = 1; i <= x; i++) {
			String txt = showInputDialog("Skriv poeng her");
			int poeng = parseInt(txt);

			if (poeng <= 100 && poeng >= 90 ) {
				System.out.println("Karakter A"); // A
			} else if (poeng <= 89 && poeng >= 80) {
				System.out.println("Karakter B"); // B
			} else if (poeng <= 79 && poeng >= 60) {
				System.out.println("Karakter C"); // C
			} else if (poeng <= 59 && poeng >= 50) {
				System.out.println("Karakter D"); // D
			} else if (poeng <= 49 && poeng >= 40) {
				System.out.println("Karakter E"); // E
			} else if (poeng <= 39 && poeng >= 0) {
				System.out.println("Karakter F"); // F
			} else {
				System.out.println("Ikke definert"); // Ikke definert
				i--;
				
					
				}
					

			}
		}

	}


package Dat100;
import static java.lang.Integer.*;  
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 { 
	public static void main(String[] args) {
		double trinn0 =0;
		double trinn1 =190349; 
		double trinn2 =267900;
		double trinn3 =643800;
		double trinn4 =969200;
		double trinn5 =2000000;
		String Txt = showInputDialog("Penger");
		double tall = Double.parseDouble(Txt);
		
		if (tall < trinn1) {
			  System.out.println(tall);
			} else if (tall <= trinn1) {
			  System.out.println(tall*1.017);   // trinn 1
			} else if (tall <= trinn2) {
				  System.out.println(tall*1.04); // trinn 2
			} else if (tall <= trinn3) {
				  System.out.println(tall*1.134); // trinn 3
			} else if (tall <= trinn4){
			  System.out.println(tall*1.164); // trinn 4
			}  else  {
				  System.out.println(tall*1.174); // trinn 5
			}
	}

}

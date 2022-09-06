package Dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;
public class O3 {
	 static int fakultet(int n){
	        if (n < 1 )return 1;
	        return n * fakultet(n -1);

	    }
	    public static void main(String[] args) {
	    	String txt = showInputDialog("Skriv n her"); 
			int n = parseInt(txt); 
			if (n<=0) {
				System.out.println("n kan ikke vere 0");
			} else { 
				System.out.println(fakultet(n));
			}
	    
	    }
 
	}

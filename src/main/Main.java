package main;

import java.util.Scanner;

public class Main {

	/*
	 * Demana cadena.
	 * Diu quantes vegades hi apareix la lletra 'a'
	 */
	public static void main(String[] args) {
		final int CAP = -1;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introdueix una frase per comptar quantes 'a' té:");
		String cadena = in.nextLine();
		
		int as = 0, lastPos = cadena.indexOf('a');
		
		while (lastPos != CAP) {
			lastPos = cadena.indexOf('a', lastPos+1);
			as++;
		}
		
		if (as == 0) System.out.println("No hi ha cap 'a' en aquesta frase.");
		else System.out.println("Hi ha " + as + " 'a' en aquesta frase.");
		
		in.close();
	}

}

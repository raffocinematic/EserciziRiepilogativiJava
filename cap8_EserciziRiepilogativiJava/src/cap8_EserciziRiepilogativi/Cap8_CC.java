package cap8_EserciziRiepilogativi;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Cap8_CC {
	public static void main(String[] args) {
		//chiediamo di inserire le coordinate dei due punti tramite input con scanner
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Inserisci coordinata x del punto 1");
			int x1 = scanner.nextInt();
			System.out.println("Inserisci coordinata y del punto 1");
			int y1 = scanner.nextInt();
			Punto p1 = new Punto(x1, y1);
			System.out.println("Creato punto:" + p1);
			System.out.println("Inserisci coordinata x del punto 2");
			int x2 = scanner.nextInt();
			System.out.println("inserisci coordinata y del punto 2");
			int y2 = scanner.nextInt();
			Punto p2 = new Punto(x2, y2);
			System.out.println("Creato punto:" + p2);
			//calcoliamo la distanza tra i due punti dati in input con scanner
			System.out.println("Distanza tra i punti: " + p1 + " e " + p2 + " = " + Righello.calcolaDistanza(p1, p2));
//eccezione ne caso si dia una coordinata che non è intera
		} catch (InputMismatchException exc) {
			System.out.println("Le ccoordinate devono essere di tipo intero!");
		}

	}
}

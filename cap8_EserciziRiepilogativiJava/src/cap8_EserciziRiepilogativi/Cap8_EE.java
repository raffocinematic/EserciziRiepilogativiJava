package cap8_EserciziRiepilogativi;

import java.util.Scanner;
//import java.util.InputMismatchException;

//partiamo dall'esercizio DD, aggiungiamo che se inserisci una coordinata in formato sbagliato (come una lettera)
//l'app segnala l'errore e deve permettere all'utente di reinserirla. Il programma termina solo quando le coordinate
//sono tutte inserite giustamente.
public class Cap8_EE {
	private Scanner scanner;

	public Cap8_EE() {
		scanner = new Scanner(System.in);
	}

	private Punto getPunto(String nomePunto) {
		int x = getCoordinata("x", nomePunto);
		int y = getCoordinata("y", nomePunto);
		Punto p = new Punto(x, y);
		System.out.println("Creato punto:" + p);
		return p;
	}

	public void stampaDistanza(Punto p1, Punto p2) {
		System.out.println("Distanza tra i punti: " + p1 + " e " + p2 + " = " + Righello.calcolaDistanza(p1, p2));
	}

	public void start() {
		Punto p1 = getPunto("1");
		Punto p2 = getPunto("2");
		stampaDistanza(p1, p2);
	}

	private int getCoordinata(String nomeCoordinata, String nomePunto) {
		System.out.println("Inserisci coordinata " + nomeCoordinata + " per il punto " + nomePunto);
		//ciclo while per fare in modo che se inserisci qualcosa che non sia int ti da errore e te lo fa reinserire.
		//il ciclo smette quando hai inserito tutte le coordinate correttamente
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				return scanner.nextInt();
			} else {
				System.out.println("Coordinata non valida " + scanner.next()
						+ "!, Le coordinate devono essere di tipo intero! " + "Prego reinserire");
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		Cap8_EE cap8_EE = new Cap8_EE();
		cap8_EE.start();
	}
}

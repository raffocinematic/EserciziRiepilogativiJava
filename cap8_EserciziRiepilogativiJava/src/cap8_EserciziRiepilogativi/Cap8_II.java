package cap8_EserciziRiepilogativi;

import java.util.Scanner;
import javax.swing.*;

//sulla falsariga dell'ese HH, qui permettiamo all'utente di specificare gli estremi dei segmenti che
//devono essere visualizzati sul piano cartesiano.
public class Cap8_II {
	private Scanner scanner;
	private CartesianPlane cartesianPlane;
	private static int contatore = 1;

	public Cap8_II() {
		scanner = new Scanner(System.in);
	}

	public void start() throws SegmentoNonValidoException {
		SwingUtilities.invokeLater(() -> cartesianPlane = new CartesianPlane());
		while (true) {
			System.out.println("Definiamo un segmento");
			Punto p1 = getPunto("P" + (contatore++));
			Punto p2 = getPunto("P" + (contatore++));
			Segmento s1 = new Segmento(p1, p2);
			cartesianPlane.drawSegments(s1);
		}
	}

	private int getCoordinata(String nomeCoordinata, String nomePunto) {
		System.out.println("Inserisci coordinata " + nomeCoordinata + " per il punto " + nomePunto);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				return scanner.nextInt();
			} else {
				System.out.println("Coordinata non valida " + scanner.next()
						+ "! Le coordinate devono essere di tipo intero! " + "Prego reinserire");
			}
		}
		return -1;
	}

	private Punto getPunto(String nomePunto) {
		int x = getCoordinata("x", nomePunto);
		int y = getCoordinata("y", nomePunto);
		Punto p = new Punto(nomePunto, x, y);
		System.out.println("Creato punto:" + p);
		return p;
	}

	public static void main(String[] args) throws SegmentoNonValidoException {
		Cap8_II cap8_II = new Cap8_II();
		cap8_II.start();
	}

}

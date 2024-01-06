package cap8_EserciziRiepilogativi;
//evolviamo l'ese GG: qui dobbiamo fare in modo che chieda di inserire le coordinate di un punto all'infinito, fino
//a quando l'app non verrà chiusa chiudendo la finestra. Così l'utente potrà visualizzare più punti sull'asse cartesiano.

import java.util.*;
import javax.swing.*;

public class Cap8_HH {
	private Scanner scanner;
	private CartesianPlane cartesianPlane;
	//ci serviamo di un contatore per farlo
	private static int contatore = 1;

	private Cap8_HH() {
		scanner = new Scanner(System.in);
	}

	public void start() {
		SwingUtilities.invokeLater(() -> cartesianPlane = new CartesianPlane());
		while (true) {
			Punto p1 = getPunto("P" + (contatore++));
			cartesianPlane.drawPoint(p1);
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

	public static void main(String[] args) {
		Cap8_HH cap8_HH = new Cap8_HH();
		cap8_HH.start();
	}
}

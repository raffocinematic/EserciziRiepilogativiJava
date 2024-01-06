package cap8_EserciziRiepilogativi;

import java.util.*;
import javax.swing.*;

public class Cap8_GG {
	private Scanner scanner;
	private CartesianPlane cartesianPlane;

	public Cap8_GG() {
		scanner = new Scanner(System.in);
	}

	public void start() {
		SwingUtilities.invokeLater(() -> cartesianPlane = new CartesianPlane());
		Punto p1 = getPunto("P1");
		cartesianPlane.drawPoint(p1);
	}

	private int getCoordinata(String nomeCoordinata, String nomePunto) {
		System.out.println("Inserisci coordinata " + nomeCoordinata + " per il punto " + nomePunto);
		while (scanner.hasNext()) {
			if (scanner.hasNext()) {
				return scanner.nextInt();
			} else {
				System.out.println("Coordinata non valida " + scanner.next()
						+ "! Le coordinate devono essere di tipo intero!" + "Prego reinserire");
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
		Cap8_GG cap8_GG = new Cap8_GG();
		cap8_GG.start();
	}
}

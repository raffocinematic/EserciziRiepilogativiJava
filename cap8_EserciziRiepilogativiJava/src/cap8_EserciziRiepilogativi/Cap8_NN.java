package cap8_EserciziRiepilogativi;
//evolviamo l'ese MM, andando a craere un metodo ricorsivo creaSegmento che gestisce l'eccezione richiamando se stesso.

//nota: abbiamo fatto diventare la variabile temporanea ultimoEstremo una variabile d'istanza.

import java.util.*;
import javax.swing.*;

public class Cap8_NN {
	private Scanner scanner;
	private CartesianPlane cartesianPlane;
	private Punto ultimoEstremo;
	private static int contatore = 1;

	public Cap8_NN() {
		scanner = new Scanner(System.in);
	}

	public void start() {
		SwingUtilities.invokeLater(() -> cartesianPlane = new CartesianPlane());
		System.out.println("Definiamo i primi due segmenti di una polilinea:");
		System.out.println("Definiamo il primo estremo del primo segmento della polilinea:");
		Punto p1 = getPunto("P" + (contatore++));
		System.out.println("Definiamo il secondo estremo del primo segmento della polilinea");
		creaSegmento(p1);
		/*
		 * Punto p3 = getPunto("P"+(contatore++)); Segmento s2 = new Segmento(p2, p3);
		 * cartesianPlane.drawSegment(s2); Punto ultimoEstremo = p3;
		 */
		while (true) {
			/*
			 * Punto prossimoEstremo = getPunto("P"+(contatore++)); Segmento
			 * prossimoSegmento = new Segmento(ultimoEstremo, prossimoEstremo);
			 * cartesianPlane.drawSegment(prossimoSegmento); ultimoEstremo =
			 * prossimoEstremo;
			 */
			creaSegmento(ultimoEstremo);
		}
	}

	private void creaSegmento(Punto primoEstremo) {
		try {
			ultimoEstremo = getPunto("P" + (contatore++));
			Segmento segmento = new Segmento(primoEstremo, ultimoEstremo);
			cartesianPlane.drawSegments(segmento);
		} catch (SegmentoNonValidoException exc) {
			System.out.println(exc);
			contatore--;
			creaSegmento(primoEstremo);
		}
	}

	private int getCoordinata(String nomeCoordinata, String nomePunto) {
		System.out.println("Inserisci coordinata " + nomeCoordinata + " peril punto " + nomePunto);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				return scanner.nextInt();
			} else {
				System.out.println("Coordinata non valida " + scanner.next()
						+ "! Le coordinate devono essere di tipo intero. Prego reinserire");
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
		Cap8_NN cap8_NN = new Cap8_NN();
		cap8_NN.start();
	}
}

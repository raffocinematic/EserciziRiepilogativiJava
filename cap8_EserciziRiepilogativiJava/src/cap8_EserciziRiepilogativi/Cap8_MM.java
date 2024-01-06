package cap8_EserciziRiepilogativi;
//esercizio che contente di craere polilinee sul piano cartesiano. l'app dovrà richiedere di inserire punto dopo punto

// gli estremi dei segmenti che costituiscono la polilinea (che verrà visualizzata dalla classe CartesianPlane).
//solo per il primo segmento verrà specificato il primo estremo, per i successivi è scontato che il primo estremo
//coincide col secondo estremo del segmento precedente.

import java.util.*;
import javax.swing.*;

public class Cap8_MM {
	private Scanner scanner;
	private CartesianPlane cartesianPlane;
	private static int contatore = 1;

	public Cap8_MM() {
		scanner = new Scanner(System.in);
	}

	public void start() throws SegmentoNonValidoException {
		SwingUtilities.invokeLater(() -> cartesianPlane = new CartesianPlane());
		System.out.println("Definiamo i primi due segmenti di una polilinea");
		System.out.println("Definiamo il primo estremo del primo segmento della" + " polilinea:");
		Punto p1 = getPunto("P" + (contatore++));
		System.out.println("Definiamo il secondo estremo del primo segmento " + "della polilinea");
		Punto p2 = getPunto("P" + (contatore++));
		Segmento s1 = new Segmento(p1, p2);
		cartesianPlane.drawSegments(s1);
		System.out.println("Definiamo il secondo estremo del secondo" + " segmento della" + " polilinea");
		Punto p3 = getPunto("P" + (contatore++));
		Segmento s2 = new Segmento(p2, p3);
		Punto ultimoEstremo = p3;
		while (true) {
			Punto prossimoEstremo = getPunto("P" + (contatore++));
			Segmento prossimoSegmento = new Segmento(ultimoEstremo, prossimoEstremo);
			cartesianPlane.drawSegments(prossimoSegmento);
			ultimoEstremo = prossimoEstremo;
		}
	}

	private int getCoordinata(String nomeCoordinata, String nomePunto) {
		System.out.println("Inserisci coordinata 1" + nomeCoordinata + " per il punto " + nomePunto);
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
		Cap8_MM cap8_MM = new Cap8_MM();
		cap8_MM.start();
	}
}

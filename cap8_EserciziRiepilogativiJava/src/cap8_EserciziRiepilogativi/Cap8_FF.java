package cap8_EserciziRiepilogativi;
//chiediamo le coordinate dei due estremi del segmento e ne stampiamo la lunghezza
import java.util.*;

public class Cap8_FF {
	private Scanner scanner;
	
	public Cap8_FF () {
		scanner = new Scanner(System.in);
	}
	
	private Punto getPunto(String nomePunto) {
		int x = getCoordinata("x", nomePunto);
		int y = getCoordinata("y", nomePunto);
		Punto p = new Punto(x,y);
		System.out.println("Creato estremo:"+p);
		return p;
	}
	
	public void stampa(Segmento segmento) {
		System.out.println(segmento);
	}
	
	public void start() {
		System.out.println("Definiamo un segmento specificando i due estremi: ");
		Punto p1 = getPunto("1");
		Punto p2 = getPunto("2");
		try {
			stampa(new Segmento(p1,p2));
		} catch (SegmentoNonValidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private int getCoordinata(String nomeCoordinata, String nomePunto) {
		System.out.println("Inserisci coordinata "+nomeCoordinata
				+" per l'estremo "+nomePunto);
		while(scanner.hasNext()) {
			if(scanner.hasNext()) {
				return scanner.nextInt();
			} else {
				System.out.println("Coordinata non valida "+scanner.next()
				+ "! Le coordinate devono essere di tipo intero! " + "Prego reinserire");
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Cap8_FF cap8_FF = new Cap8_FF();
		cap8_FF.start();
	}
	
	
}

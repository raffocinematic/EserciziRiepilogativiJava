package cap8_EserciziRiepilogativi;

//classe segmento che astrae il concetto di linea retta compresa tra due punti
public class Segmento {
	// variabili d'istanza
	private Punto estremo1;
	private Punto estremo2;

	private double lunghezza;

//costruttore									//gli facciamo lanciare l'eccezione personalizzata qui
	public Segmento(Punto estremo1, Punto estremo2) throws SegmentoNonValidoException {
		this.estremo1 = estremo1;
		this.estremo2 = estremo2;
		setLunghezza();
	}

//get e set che servono
	public Punto getEstremo1() {
		return estremo1;
	}

	public Punto getEstremo2() {
		return estremo2;
	}

	// lanciamo l'eccezione personalizzata anche qui
	private void setLunghezza() throws SegmentoNonValidoException {
		this.lunghezza = Righello.calcolaDistanza(estremo1, estremo2);
		if (lunghezza == 0) {
			throw new SegmentoNonValidoException();
		}
	}

//to string
	public String toString() {
		return "Segmento da P1" + estremo1 + " a P2" + estremo2 + " con lunghezza = " + lunghezza;
	}
}

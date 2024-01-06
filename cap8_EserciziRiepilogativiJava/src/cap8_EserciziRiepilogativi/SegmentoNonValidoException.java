package cap8_EserciziRiepilogativi;

//eccezione personalizzata per la creazioen errata di un segmento
public class SegmentoNonValidoException extends Exception {

	public String toString() {
		return "Gli estremi di un segmento non possono coincidere!";
	}

}

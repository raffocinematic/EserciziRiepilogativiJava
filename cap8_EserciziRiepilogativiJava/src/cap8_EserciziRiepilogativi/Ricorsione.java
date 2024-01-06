package cap8_EserciziRiepilogativi;
//PSEUDOCODICE ricorsione

//ricorsione (n)
//se n è uguale a 0 ritorna 1
//altrimenti
//richiama ricorsione n-1

public class Ricorsione {

	int ricorsione(int x) {
		int fattoriale;
		if (x == 0)
			fattoriale = 1;
		else
			fattoriale = x * ricorsione(x - 1);
		return fattoriale;
	}
}

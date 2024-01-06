package cap8_EserciziRiepilogativi;
//evolviamo l'esercizio OO. Float non ci permette di definire una formattazione univoca.

//usiamo la classe BigDecimal in modo che i valori vengano formattati specificando solo le prime due cifre decimali

import java.util.*;
import java.math.*;

public class Cap8_PP {
	public static void main(String[] args) {
		Cap8_PP cap8_PP = new Cap8_PP();
		cap8_PP.start();
	}

	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Inserisci valore in Kelvin");
			BigDecimal kelvin = scanner.nextBigDecimal();
			BigDecimal celsius = kelvin.subtract(BigDecimal.valueOf(273.15));// valueOf restituisce l'oggeto numero
																				// pertinente che contiene il valore
																				// dell'argomento passato, l'argomento
																				// può essere un tipo primitivo, string
																				// ecc.
			// substract viene usato per calcolare la differenza aritmetica di grandi numeri
			// senza compromettere la precisione del risultato.
			BigDecimal fahrenheit = celsius.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5))
					.add(BigDecimal.valueOf(32));
			System.out.println("Il valore di " + kelvin + " gradi Kelvin equivale a:\n" + celsius + " gradi Celsius\n"
					+ fahrenheit + " gradi Fahrenheit");
		} catch (InputMismatchException exc) {
			System.out.println("Il valore deve essere numerico!");
			start();
		}
	}
}

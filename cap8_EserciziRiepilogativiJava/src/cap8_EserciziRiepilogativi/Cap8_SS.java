package cap8_EserciziRiepilogativi;

//miglioriamo il codice dell'esercizio RR, usiamo la classe Stampante
import java.util.*;
import java.math.*;

public class Cap8_SS {
	private static final String K = "Kelvin";
	private static final String C = "Celsius";
	private static final String F = "Fahrenheit";

	public static void main(String[] args) {
		Cap8_SS cap8_SS = new Cap8_SS();
		cap8_SS.start();
	}

	public void start() {
		try

		{
			// "puliamo" l'esercizio RR richiamando il metodo della classe stampante
			Stampante.stampaIstruzioni();
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			int lastCharIndex = input.length() - 1;
			BigDecimal valore = new BigDecimal(input.substring(0, lastCharIndex));
			String scala = input.substring(lastCharIndex);
			switch (scala) {
			case "k":
			case "K": {
				BigDecimal celsius = Convertitore.convertiKelvinInCelsius(valore);
				BigDecimal fahrenheit = Convertitore.convertiKelvinInFahrenheit(valore);
				Stampante.stampaMessaggio(valore, K, celsius, C, fahrenheit, F);
				break;
			}
			case "c":
			case "C": {
				BigDecimal kelvin = Convertitore.convertiCelsiusInKelvin(valore);
				BigDecimal fahrenheit = Convertitore.convertiCelsiusInFahrenheit(valore);
				Stampante.stampaMessaggio(valore, C, kelvin, K, fahrenheit, F);
				break;
			}
			case "f":
			case "F": {
				BigDecimal celsius = Convertitore.convertiFahrenheitInCelsius(valore);
				BigDecimal kelvin = Convertitore.convertiFahrenheitInKelvin(valore);
				Stampante.stampaMessaggio(valore, F, celsius, C, kelvin, K);
				break;
			}
			default:
				Stampante.stampaScalaErrata(scala);
				start();
			}
		} catch (NumberFormatException exc) {
			Stampante.stampaFormatoErrato();
			start();
		}
	}
}

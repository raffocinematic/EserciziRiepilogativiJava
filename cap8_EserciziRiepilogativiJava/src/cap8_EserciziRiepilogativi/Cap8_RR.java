package cap8_EserciziRiepilogativi;

import java.math.BigDecimal;
import java.util.Scanner;

//evolviamo l'esercizio QQ cercando di migliorare l'astrazione del codice. Faremo uso di una classe Convertitore e ne
//useremo i metodi (tutti dichiarati statici)
public class Cap8_RR {
	public static void main(String[] args) {
		Cap8_RR cap8_RR = new Cap8_RR();
		cap8_RR.start();
	}

	public void start() {
		try {
			System.out
					.println("Inserisci un valore in Kelvin (per esempio 12K)" + ", Celsius (25C) o Fahrenheit (451F)");
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
				System.out.println("Il valore di " + valore + " gradi Kelvin equivale a:\n" + celsius
						+ " gradi Celsius\n" + fahrenheit + " gradi Fahrenheit");
				break;
			}
			case "c":
			case "C": {
				BigDecimal kelvin = Convertitore.convertiCelsiusInKelvin(valore);
				BigDecimal fahrenheit = Convertitore.convertiCelsiusInFahrenheit(valore);
				System.out.println("Il valore di " + valore + " gradi Celsius equivale a:\n" + kelvin
						+ " gradi Kelvin\n" + fahrenheit + " gradi Fahrenheit");
				break;
			}
			case "f":
			case "F": {
				BigDecimal celsius = Convertitore.convertiFahrenheitInCelsius(valore);
				BigDecimal kelvin = Convertitore.convertiFahrenheitInKelvin(valore);
				System.out.println("Il valore di " + valore + " gradi Fahrenheit equivale a:\n" + celsius
						+ " gradi Celsius\n" + kelvin + " gradi Kelvin");
				break;
			}
			default:
				System.out.println(
						"Scala " + scala + " non valida. Usare K per" + " Kelvin, C per Celsius, F per Fahrenheit");
				start();
			}
		} catch (NumberFormatException exc) {
			System.out.println("Formato errato!");
			start();
		}
	}
}
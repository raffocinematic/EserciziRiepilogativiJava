package cap8_EserciziRiepilogativi;

//convertitore dalla scala Kelving alle scale Celsius e Fahrenheit. L'app chiederà di inserire un valore in Kelvin e il
//programma lo convertirà in gradi Celsius e Fahrenheit. Utilizzare il tipo float per fare i calcoli.
import java.util.*;

public class Cap8_OO {

	public static void main(String[] args) {
		Cap8_OO cap8_OO = new Cap8_OO();
		cap8_OO.start();

	}

	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Inserisci valore in Kelvin");
			float kelvin = scanner.nextFloat();
			float celsius = kelvin - 273.15F;
			float fahrenheit = celsius * 9 / 5 + 32;
			System.out.println("Il valore di " + kelvin + " gradi Kelvin equivale a:\n" + celsius + " gradi Celsius\n"
					+ fahrenheit + " gradi Fahrenheit");
		} catch (InputMismatchException exc) {
			System.out.println("Il valore deve essere numerico");
			start();
		}
	}

}

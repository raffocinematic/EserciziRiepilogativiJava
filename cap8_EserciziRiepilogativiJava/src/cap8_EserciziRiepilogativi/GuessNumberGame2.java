package cap8_EserciziRiepilogativi;
//ESE CAP8_VV

//evolviamo il gioco guess number dato che prima non teneva conta della possibilità che l'utente inserisca dati
//non validi. Gestiamo quindi tale eventualità di input scorretto.

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame2 implements Game {
	private static final int MAX_NUMBER = 100;
	private Scanner scanner;
	private int attemptsNumber;
	private int numberToGuess;

	public GuessNumberGame2() {
		init();
		start();
		play();
		end();
	}

	@Override
	public void init() {
		scanner = new Scanner(System.in);
		numberToGuess = GuessNumber.generateRandomNumber(MAX_NUMBER);
	}

	@Override
	public void start() {
		System.out.println("Ho pensato ad un numero tra 1 e " + MAX_NUMBER + ", indovinalo!");
	}

	@Override
	public void play() {
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				attemptsNumber++;
				int number = scanner.nextInt();
				if (number < numberToGuess) {
					System.out.println("Troppo basso, riprova");
				} else if (number > numberToGuess) {
					System.out.println("Troppo alto, riprova");
				} else {
					return;
				}
				// play() 
				//non funziona questo controllo se inserisco una lettera
			} else {
				System.out.println(
						"Input '" + scanner.next() + "' non valido. Puoi inserire solo numeri interi, riprova");
			}
		}
	}

	@Override
	public void end() {
		System.out.println("Complimenti! Hai indovinato dopo " + attemptsNumber + " tentativi");
	}

	public static void main(String args[]) {
		new GuessNumberGame();
	}
}

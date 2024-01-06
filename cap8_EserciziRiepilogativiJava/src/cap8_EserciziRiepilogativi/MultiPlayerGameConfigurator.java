package cap8_EserciziRiepilogativi;

//implementiamo l'interfaccia Configurator
//Con questa classe permettiamo di configurare un gioco e farlo diventare multigiocatore, deve permettere di inserire
//i nomi dei giocatori che devono partecipare al gioco, assegnando a ognuno di essi un id progressivo.
//questa classe deve dichiarare come variabile d'istanza quantomeno un oggetto di tipo MultiPlayerGameImpl a cui devono
//essere aggiunti i giocatori
import java.util.Scanner;

public class MultiPlayerGameConfigurator implements Configurator {
	private static int counter;
	private Scanner scanner;
	private MultiPlayerGameImpl game;

	public MultiPlayerGameConfigurator() {
		game = new MultiPlayerGameImpl();
		scanner = new Scanner(System.in);
		config();
		game.printPlayers();
	}

	@Override
	//nota: config è un metodo implementato in maniera ricorsiva, così ci permette di aggiungere quanti giocatori vogliamo
	public void config() {
		var players = game.getPlayers();
		System.out.println("Inserire nome player " + (++counter)
				+ (players.isEmpty() ? "" : " oppure 'i' per iniziare a giocare"));
		String text = scanner.next();
		if (!players.isEmpty() && text.equals("i")) {
			return;
		}
		game.addPlayer(new Player(counter, text));
		config();
	}
}

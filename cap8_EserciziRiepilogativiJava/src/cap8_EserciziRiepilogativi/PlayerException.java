package cap8_EserciziRiepilogativi;

public class PlayerException extends Exception {
	public PlayerException(String message) {
		super("Eccezione riguardare il player: " + message);
	}

}

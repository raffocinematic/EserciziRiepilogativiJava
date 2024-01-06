package cap8_EserciziRiepilogativi;

public class Punto2 {
	private int x, y;

	public Punto2() {
		// costruttore senza paramentri
	}

	public Punto2(int x, int y) {
		this.setXY(x, y); // this � facoltativo
		// riutilizziamo codice
	}

	public void setX(int x) {
		this.x = x;// this NON � facoltativo
	}

	public void setY(int y) {
		this.y = y; // this NON � facoltativo
	}

	public void setXY(int x, int y) {
		this.setX(x); // this � facoltativo
		this.setY(y);
	}

	public int getX() {
		return this.x; // this � facoltativo
	}

	public int getY() {
		return this.y; // this � facoltativo
	}

	public double dammiDistanza(Punto2 p) {
		// quadrato della differenza delle x dei due punti
		int tmp1 = (x - p.x) * (x - p.x);
		// quadrato della differenza della y dei due punti
		int tmp2 = (y - p.y) * (y - p.y);
		// radice quadrata della somma dei due quadrati
		return Math.sqrt(tmp1 + tmp2);
	}

}

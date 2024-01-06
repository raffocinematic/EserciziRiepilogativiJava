package cap8_EserciziRiepilogativi;

public class Punto2_3D extends Punto2 {
	private int z;

	public Punto2_3D() {
		// costruttore senza paramentri
	}

	public Punto2_3D(int x, int y, int z) {
		this.setXYZ(x, y, z); // riuso di codice
	}

	// metodi set
	public void setZ(int z) {
		this.z = z; // this NON è facoltativo
	}

	public void setXYZ(int x, int y, int z) {
		this.setXY(x, y); // riuso di codice
		this.setZ(z); // this è facoltativo
	}

	// metodo get
	public int getZ() {
		return this.z; // this è facoltativo
	}

	@Override
	public double dammiDistanza(Punto2 p) {
		if (p instanceof Punto2_3D) {
			// chiamata a un metodo privato tramite casting
			return this.calcolaDistanza((Punto2_3D) p);
		} else {
			return -1; // distanza non valida!
		}
	}

	private double calcolaDistanza(Punto2_3D p1) {
		// quadrato della differenza della x dei due punto
		int tmp1 = (getX() - p1.getX()) * (getX() - p1.getX());
		// quadrato della differenza della y dei due punti
		int tmp2 = (getY() - p1.getY()) * (getY() - p1.getY());
		// quadrato della differenza delal z dei due punti
		int tmp3 = (z - p1.z) * (z - p1.z);
		// radice dquadrata della somma dei tre quadrati
		return Math.sqrt(tmp1 + tmp2 + tmp3);
	}

}

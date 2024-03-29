package cap8_EserciziRiepilogativi;

public class Punto {
	private String nome;
    private int x;
    private int y;

    public Punto (String nome, int x, int y) {
    	setNome(nome);
        setX(x);
        setY(y);
    }
    
    public Punto(int x, int y) {
    	this("", x, y);
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getNome() {
    	return nome;
    }

    private void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public String toString() {
        return "("+x+"," + y + ")";
    }

	public double dammiDistanza(Punto p2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double dammiDistanza(Punto2_3D p2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
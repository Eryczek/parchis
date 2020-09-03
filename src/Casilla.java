import java.util.ArrayList;

public class Casilla {
	
	private int number, posX1, posY1, posX2, posY2;
	private boolean block, save;
	private ArrayList<Ficha> fichas;
	
	public Casilla(int num, int px1, int py1, int px2, int py2, boolean save) {
		
		this.number = num;
		this.posX1 = px1;
		this.posY1 = py1;
		this.posX2 = px2;
		this.posY2 = py2;
		
		this.setBlock(false);
		this.setSave(save);
		this.fichas = new ArrayList<Ficha>();
	}

	// Getters and Setters
	
	public int getNumber() {
		return number;
	}

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean b) {
		this.block = b;
	}
	
	public ArrayList<Ficha> getFichas() {
		return fichas;
	}

	public int getFichasEnCasilla() {
		return fichas.size();
	}
	
	public void removeFichaFromCasilla(Ficha ficha) {
		fichas.remove(ficha);
	}

	public void addFichaToCasillas(Ficha ficha) {
		fichas.add(ficha);
	}

	public int getPosX1() {
		return posX1;
	}

	public int getPosY1() {
		return posY1;
	}

	public int getPosX2() {
		return posX2;
	}

	public int getPosY2() {
		return posY2;
	}

	public boolean isSave() {
		return save;
	}

	private void setSave(boolean save) {
		this.save = save;
	}
	
	

}

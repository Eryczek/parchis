import java.util.ArrayList;

import javax.swing.Icon;

public class Player {
	
	private String name;
	private Icon icon;
	private boolean move, block, move10, move20;
	private ArrayList<Ficha> fichas;
	private ArrayList<Casilla> lastCasillas;
	
	public Player(String namePlayer, Icon i) {
		
		this.name = namePlayer;
		this.icon = i;
		this.setMove(false);
		this.setMove10(false);
		this.setMove20(false);
		
		fichas = new ArrayList<Ficha>();
		lastCasillas = new ArrayList<Casilla>();
		
	}
	
	// Getters and Setters
	
	public Icon getIcon() {
		return this.icon;
	}
	
	public String getName() {
		return this.name;
	}

	public ArrayList<Ficha> getFichas() {
		return fichas;
	}

	public void addFicha(Ficha ficha) {
		this.fichas.add(ficha);
	}
	
	public ArrayList<Casilla> getLastCasillas() {
		return this.lastCasillas;
	}
	
	public void addLastCasilla(Casilla cas) {
		this.lastCasillas.add(cas);
	}

	public boolean isMove() {
		return move;
	}

	public void setMove(boolean move) {
		this.move = move;
	}

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
	}

	public boolean isMove10() {
		return move10;
	}

	public void setMove10(boolean move10) {
		this.move10 = move10;
	}

	public boolean isMove20() {
		return move20;
	}

	public void setMove20(boolean move20) {
		this.move20 = move20;
	}

}

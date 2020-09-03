import javax.swing.JLabel;

public class Ficha {
	
	private int casaPosX, casaPosY, initPos, posNumber, ficha, casillaFinal;
	private JLabel label;
	private Player player;
	
	public Ficha(Player p, int f, int cx, int cy, int init, int cf) {
		
		this.player = p;
		this.ficha = f;
		this.casaPosX = cx;
		this.casaPosY = cy;
		this.initPos = init;
		this.casillaFinal = cf;
		this.posNumber = 0;
		
		this.label = new JLabel();
				 
	}

	// Getters and Setters

	public Player getPlayer() {
		return this.player;
	}
	
	public JLabel getLabel() {
		return this.label;
	}
	
	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	public int getPosNumber() {
		return posNumber;
	}

	public void setPosNumber(int posNumber) {
		this.posNumber = posNumber;
	}

	public int getCasaPosX() {
		return casaPosX;
	}

	public int getCasaPosY() {
		return casaPosY;
	}

	public int getInitPos() {
		return initPos;
	}

	public int getFicha() {
		return ficha;
	}

	public int getCasillaFinal() {
		return casillaFinal;
	}
	
}

import java.util.ArrayList;
import java.util.Random;

public class Game {

	private ArrayList<Player> players;
	private ArrayList<Casilla> casillas;
	private int player, dado;
	
	
	
	public Game (ArrayList<Player> players) {
		
		Random rand = new Random();
		
		this.players = players;
		this.player = rand.nextInt(players.size());
		this.dado = 0;
		
		casillas = new ArrayList<Casilla>();
		
		setInitGame();
	}
	
	// Game Functions
	
	public int tirarDados() {
		
		Random rand = new Random();
		long timeStamp1 = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - timeStamp1 < 1000) {}
			
		dado = rand.nextInt(6) + 1;	
		
		players.get(player).setMove(true);
	
		return dado;
	}
	
	
	
	// Getters and Setters
	
		public ArrayList<Casilla> getCasillas(){
			return casillas;
		}
	
		public ArrayList<Player> getPlayers() {
			return players;
		}
		
		public void removePlayer(int p) {
			this.players.remove(p);
		}
		
		public int getDado() {
			return dado;
		}

		public Player getPlayer(int num) {
			return players.get(num - 1);
		}

		public int getPlayerTurn() {
			return player;
		}
		
		public void setPlayerTurn(int num) {
			this.player = num;
		}
				

	// Init Functions
		
		private void setInitGame() {
			
			//Azul
			
			players.get(0).addFicha(new Ficha(players.get(0), 11, 90, 760, 56, 51));
			players.get(0).addFicha(new Ficha(players.get(0), 12, 220, 760, 56, 51));
			players.get(0).addFicha(new Ficha(players.get(0), 13, 90, 895, 56, 51));
			players.get(0).addFicha(new Ficha(players.get(0), 14, 220, 895, 56, 51));
			
			players.get(0).addLastCasilla(new Casilla(100, 5, 460, 5, 525, true));
			players.get(0).addLastCasilla(new Casilla(101, 55, 460, 55, 525, true));
			players.get(0).addLastCasilla(new Casilla(102, 105, 460, 105, 525, true));
			players.get(0).addLastCasilla(new Casilla(103, 155, 460, 155, 525, true));
			players.get(0).addLastCasilla(new Casilla(104, 205, 460, 205, 525, true));
			players.get(0).addLastCasilla(new Casilla(105, 255, 460, 255, 525, true));
			players.get(0).addLastCasilla(new Casilla(106, 305, 460, 305, 525, true));
			players.get(0).addLastCasilla(new Casilla(107, 355, 460, 355, 525, true));
			players.get(0).addLastCasilla(new Casilla(108, 440, 495, 5, 980, true));
		

			if(players.size() == 2) {
				
				//Verde
				
				players.get(1).addFicha(new Ficha(players.get(1), 21, 760, 90, 22, 17));
				players.get(1).addFicha(new Ficha(players.get(1), 22, 890, 90, 22, 17));
				players.get(1).addFicha(new Ficha(players.get(1), 23, 760, 225, 22, 17));
				players.get(1).addFicha(new Ficha(players.get(1), 24, 890, 225, 22, 17));
				
				players.get(1).addLastCasilla(new Casilla(100, 975, 525, 975, 465, true));
				players.get(1).addLastCasilla(new Casilla(101, 925, 525, 925, 465, true));
				players.get(1).addLastCasilla(new Casilla(102, 875, 525, 875, 465, true));
				players.get(1).addLastCasilla(new Casilla(103, 825, 525, 825, 465, true));
				players.get(1).addLastCasilla(new Casilla(104, 775, 525, 775, 465, true));
				players.get(1).addLastCasilla(new Casilla(105, 725, 525, 725, 465, true));
				players.get(1).addLastCasilla(new Casilla(106, 675, 525, 675, 465, true));
				players.get(1).addLastCasilla(new Casilla(107, 625, 525, 625, 465, true));
				players.get(1).addLastCasilla(new Casilla(108, 555, 490, 675, 5, true));
				
			} else {
				
				//Amarillo
				
				players.get(1).addFicha(new Ficha(players.get(1), 21, 760, 760, 5, 68));
				players.get(1).addFicha(new Ficha(players.get(1), 22, 890, 760, 5, 68));
				players.get(1).addFicha(new Ficha(players.get(1), 23, 760, 895, 5, 68));
				players.get(1).addFicha(new Ficha(players.get(1), 24, 890, 895, 5, 68));
				
				players.get(1).addLastCasilla(new Casilla(100, 525, 975, 460, 975, true));
				players.get(1).addLastCasilla(new Casilla(101, 525, 925, 460, 925, true));
				players.get(1).addLastCasilla(new Casilla(102, 525, 975, 460, 875, true));
				players.get(1).addLastCasilla(new Casilla(103, 525, 925, 460, 825, true));
				players.get(1).addLastCasilla(new Casilla(104, 525, 775, 460, 775, true));
				players.get(1).addLastCasilla(new Casilla(105, 525, 725, 460, 725, true));
				players.get(1).addLastCasilla(new Casilla(106, 525, 675, 460, 675, true));
				players.get(1).addLastCasilla(new Casilla(107, 525, 625, 460, 625, true));
				players.get(1).addLastCasilla(new Casilla(108, 500, 560, 675, 980, true));
				
				//Verde
				
				players.get(2).addFicha(new Ficha(players.get(2), 31, 760, 90, 22, 17));
				players.get(2).addFicha(new Ficha(players.get(2), 32, 895, 90, 22, 17));
				players.get(2).addFicha(new Ficha(players.get(2), 33, 760, 225, 22, 17));
				players.get(2).addFicha(new Ficha(players.get(2), 34, 895, 225, 22, 17));
				
				players.get(2).addLastCasilla(new Casilla(100, 975, 525, 975, 465, true));
				players.get(2).addLastCasilla(new Casilla(101, 925, 525, 925, 465, true));
				players.get(2).addLastCasilla(new Casilla(102, 875, 525, 875, 465, true));
				players.get(2).addLastCasilla(new Casilla(103, 825, 525, 825, 465, true));
				players.get(2).addLastCasilla(new Casilla(104, 775, 525, 775, 465, true));
				players.get(2).addLastCasilla(new Casilla(105, 725, 525, 725, 465, true));
				players.get(2).addLastCasilla(new Casilla(106, 675, 525, 675, 465, true));
				players.get(2).addLastCasilla(new Casilla(107, 625, 525, 625, 465, true));
				players.get(2).addLastCasilla(new Casilla(108, 555, 490, 675, 5, true));
				
				
				if(players.size() == 4) {
					
					//Rojo

					players.get(3).addFicha(new Ficha(players.get(3), 41, 90, 90, 39, 34));
					players.get(3).addFicha(new Ficha(players.get(3), 42, 220, 90, 39, 34));
					players.get(3).addFicha(new Ficha(players.get(3), 43, 90, 225, 39, 34));
					players.get(3).addFicha(new Ficha(players.get(3), 44, 220, 225, 39, 34));
					
					players.get(3).addLastCasilla(new Casilla(100, 460, 5, 525, 5, true));
					players.get(3).addLastCasilla(new Casilla(101, 460, 55, 525, 55, true));
					players.get(3).addLastCasilla(new Casilla(102, 460, 105, 525, 105, true));
					players.get(3).addLastCasilla(new Casilla(103, 460, 155, 525, 155, true));
					players.get(3).addLastCasilla(new Casilla(104, 460, 205, 525, 205, true));
					players.get(3).addLastCasilla(new Casilla(105, 460, 255, 525, 255, true));
					players.get(3).addLastCasilla(new Casilla(106, 460, 305, 525, 305, true));
					players.get(3).addLastCasilla(new Casilla(107, 460, 355, 525, 355, true));
					players.get(3).addLastCasilla(new Casilla(108, 490, 445, 5, 5, true));
					
				}
			}
			
			casillas.add(new Casilla(1, 620, 975, 565, 975, false));
			casillas.add(new Casilla(2, 620, 925, 565, 925, false));
			casillas.add(new Casilla(3, 620, 875, 565, 875, false));
			casillas.add(new Casilla(4, 620, 825, 565, 825, false));
			casillas.add(new Casilla(5, 620, 775, 565, 775, true));
			casillas.add(new Casilla(6, 620, 725, 565, 725, false));
			casillas.add(new Casilla(7, 620, 675, 565, 675, false));
			casillas.add(new Casilla(8, 605, 625, 565, 605, false));
			casillas.add(new Casilla(9, 625, 605, 605, 565, false));
			casillas.add(new Casilla(10, 675, 625, 675, 565, false));
			casillas.add(new Casilla(11, 725, 625, 725, 565, false));
			casillas.add(new Casilla(12, 775, 625, 775, 565, true));
			casillas.add(new Casilla(13, 825, 625, 825, 565, false));
			casillas.add(new Casilla(14, 875, 625, 875, 565, false));
			casillas.add(new Casilla(15, 925, 625, 925, 565, false));
			casillas.add(new Casilla(16, 975, 625, 975, 565, false));
			casillas.add(new Casilla(17, 975, 525, 975, 465, true));	
			casillas.add(new Casilla(18, 975, 360, 975, 420, false));
			casillas.add(new Casilla(19, 925, 360, 925, 420, false));
			casillas.add(new Casilla(20, 875, 360, 875, 420, false));
			casillas.add(new Casilla(21, 825, 360, 825, 420, false));
			casillas.add(new Casilla(22, 775, 360, 775, 420, true));
			casillas.add(new Casilla(23, 725, 360, 725, 420, false));
			casillas.add(new Casilla(24, 675, 360, 675, 420, false));
			casillas.add(new Casilla(25, 630, 380, 605, 420, false));
			casillas.add(new Casilla(26, 605, 355, 565, 380, false));
			casillas.add(new Casilla(27, 625, 305, 565, 305, false));
			casillas.add(new Casilla(28, 625, 255, 565, 255, false));
			casillas.add(new Casilla(29, 625, 205, 565, 205, true));
			casillas.add(new Casilla(30, 625, 155, 565, 155, false));
			casillas.add(new Casilla(31, 625, 105, 565, 105, false));
			casillas.add(new Casilla(32, 625, 55, 565, 55, false));
			casillas.add(new Casilla(33, 625, 5, 565, 5, false));
			casillas.add(new Casilla(34, 460, 5, 525, 5, true));
			casillas.add(new Casilla(35, 355, 5, 420, 5, false));
			casillas.add(new Casilla(36, 355, 55, 420, 55, false));
			casillas.add(new Casilla(37, 355, 105, 420, 105, false));
			casillas.add(new Casilla(38, 355, 155, 420, 155, false));
			casillas.add(new Casilla(39, 355, 205, 420, 205, true));
			casillas.add(new Casilla(40, 355, 255, 420, 255, false));
			casillas.add(new Casilla(41, 355, 305, 420, 305, false));
			casillas.add(new Casilla(42, 380, 355, 420, 380, false));
			casillas.add(new Casilla(43, 355, 380, 380, 420, false));
			casillas.add(new Casilla(44, 305, 355, 305, 420, false));
			casillas.add(new Casilla(45, 255, 355, 255, 420, false));
			casillas.add(new Casilla(46, 205, 355, 205, 420, true));
			casillas.add(new Casilla(47, 155, 355, 155, 420, false));
			casillas.add(new Casilla(48, 105, 355, 105, 420, false));
			casillas.add(new Casilla(49, 55, 355, 55, 420, false));
			casillas.add(new Casilla(50, 5, 355, 5, 420, false));
			casillas.add(new Casilla(51, 5, 460, 5, 525, true));
			casillas.add(new Casilla(52, 5, 625, 5, 565, false));
			casillas.add(new Casilla(53, 55, 625, 55, 565, false));
			casillas.add(new Casilla(54, 105, 625, 105, 565, false));
			casillas.add(new Casilla(55, 155, 625, 155, 565, false));
			casillas.add(new Casilla(56, 205, 625, 205, 565, true));
			casillas.add(new Casilla(57, 255, 625, 255, 565, false));
			casillas.add(new Casilla(58, 305, 625, 305, 565, false));
			casillas.add(new Casilla(59, 355, 605, 380, 565, false));
			casillas.add(new Casilla(60, 380, 630, 420, 605, false));
			casillas.add(new Casilla(61, 355, 675, 420, 675, false));
			casillas.add(new Casilla(62, 355, 725, 420, 725, false));
			casillas.add(new Casilla(63, 355, 775, 420, 775, true));
			casillas.add(new Casilla(64, 355, 825, 420, 825, false));
			casillas.add(new Casilla(65, 355, 875, 420, 875, false));
			casillas.add(new Casilla(66, 355, 925, 420, 925, false));
			casillas.add(new Casilla(67, 355, 975, 420, 975, false));
			casillas.add(new Casilla(68, 525, 975, 460, 975, true));
		}
	
}

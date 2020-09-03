
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4788865354490698806L;
	private JPanel contentPane, menuPanel, boardPanel;
	private JLabel boardLabel;
	private Ficha ultimaFicha;
	private int numSeises, dado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		this.numSeises = 0;
		
		setInitGame();
		setNumPlayers();
		
		
		
	}
	
	// setting parameters Functions
	
	public void setInitGame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1543, 1029);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		boardPanel = new JPanel();
		boardPanel.setBorder(null);
		boardPanel.setBounds(0, 0, 1024, 1024);
		contentPane.add(boardPanel);
		boardPanel.setLayout(null);
		
		boardLabel = new JLabel("");
		Image boardImage = new ImageIcon(this.getClass().getResource("/parchis-board.png")).getImage();
		boardLabel.setIcon(new ImageIcon(boardImage));
		boardLabel.setBounds(0, 0, 1024, 1024);
		boardPanel.add(boardLabel);
		
		menuPanel = new JPanel();
		menuPanel.setBounds(1024, 0, 512, 1024);
		contentPane.add(menuPanel);		
		menuPanel.setLayout(null);
		
	}
	
	public void setNumPlayers() {
		
		
		JLabel lblNumeroDeJugadores = new JLabel("Numero de Jugadores: ");
		lblNumeroDeJugadores.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblNumeroDeJugadores.setBounds(52, 100, 263, 51);
		menuPanel.add(lblNumeroDeJugadores);
		
		JComboBox<String> numJugadoresComboBox = new JComboBox<String>();
		numJugadoresComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"2", "3", "4"}));
		numJugadoresComboBox.setBounds(318, 116, 47, 24);
		menuPanel.add(numJugadoresComboBox);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(52, 184, 117, 25);
		menuPanel.add(btnSiguiente);
		
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num = numJugadoresComboBox.getSelectedItem().toString();
				
				lblNumeroDeJugadores.setVisible(false);
				numJugadoresComboBox.setVisible(false);
				btnSiguiente.setVisible(false);
				
				setInitPlayers(num);
				
			}
		});
		
	}
	
	public void setInitPlayers(String numPlayer) {
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		menuPanel.repaint();
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(52, 450, 117, 25);
		menuPanel.add(btnSiguiente);
		
		JLabel lblNumeroDeJugadores = new JLabel("Numero de Jugadores: " + numPlayer);
		lblNumeroDeJugadores.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblNumeroDeJugadores.setBounds(52, 100, 263, 50);
		menuPanel.add(lblNumeroDeJugadores);
		
		JLabel lblNombreDeJugadores = new JLabel("Nombre de los Jugadores: ");
		lblNombreDeJugadores.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNombreDeJugadores.setBounds(52, 150, 263, 50);
		menuPanel.add(lblNombreDeJugadores);
		
		JLabel lblAzul = new JLabel("");
		Image boardImageAzul = new ImageIcon(this.getClass().getResource("/azul.png")).getImage();
		lblAzul.setIcon(new ImageIcon(boardImageAzul));
		lblAzul.setBounds(260, 200, 40, 40);
		menuPanel.add(lblAzul);
		
		JTextField txtNombreDelJugador1 = new JTextField();
		//txtNombreDelJugador1.setText(" ");
		txtNombreDelJugador1.setBounds(52, 200, 200, 40);
		menuPanel.add(txtNombreDelJugador1);
		txtNombreDelJugador1.setColumns(10);

		JLabel lblVerde = new JLabel("");
		Image boardImageVerde = new ImageIcon(this.getClass().getResource("/verde.png")).getImage();
		lblVerde.setIcon(new ImageIcon(boardImageVerde));
		lblVerde.setBounds(260, 260, 40, 40);
		menuPanel.add(lblVerde);
		
		JTextField txtNombreDelJugador2 = new JTextField();
		//txtNombreDelJugador2.setText(" ");
		txtNombreDelJugador2.setBounds(52, 260, 200, 40);
		menuPanel.add(txtNombreDelJugador2);
		txtNombreDelJugador2.setColumns(10);
		
		JTextField txtNombreDelJugador3 = new JTextField();
		JTextField txtNombreDelJugador4 = new JTextField();
		JLabel lblAmarillo = new JLabel("");
		JLabel lblRojo = new JLabel("");
		
		if(numPlayer.equals("3") || numPlayer.equals("4")) {
			
			Image boardImageAmarillo = new ImageIcon(this.getClass().getResource("/amarillo.png")).getImage();
			lblAmarillo.setIcon(new ImageIcon(boardImageAmarillo));
			lblAmarillo.setBounds(260, 320, 40, 40);
			menuPanel.add(lblAmarillo);
			
			//txtNombreDelJugador3.setText(" ");
			txtNombreDelJugador3.setBounds(52, 320, 200, 40);
			menuPanel.add(txtNombreDelJugador3);
			txtNombreDelJugador3.setColumns(10);
		}
		
		if(numPlayer.equals("4")) {
			
			//txtNombreDelJugador4.setText(" ");
			txtNombreDelJugador4.setBounds(52, 380, 200, 40);
			menuPanel.add(txtNombreDelJugador4);
			txtNombreDelJugador4.setColumns(10);
			
			Image boardImageRojo = new ImageIcon(this.getClass().getResource("/rojo.png")).getImage();
			lblRojo.setIcon(new ImageIcon(boardImageRojo));
			lblRojo.setBounds(260, 380, 40, 40);
			menuPanel.add(lblRojo);
			
		}
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Image fichaAmarilla = new ImageIcon(this.getClass().getResource("/fichaAmarilla.png")).getImage();
				Image fichaAzul = new ImageIcon(this.getClass().getResource("/fichaAzul.png")).getImage();
				Image fichaRoja = new ImageIcon(this.getClass().getResource("/fichaRoja.png")).getImage();
				Image fichaVerde = new ImageIcon(this.getClass().getResource("/fichaVerde.png")).getImage();
				
				if(numPlayer.equals("2")) {
					players.add(new Player(txtNombreDelJugador1.getText(), new ImageIcon(fichaAzul)));
					players.add(new Player(txtNombreDelJugador2.getText(),  new ImageIcon(fichaVerde)));
				}
				
				if(numPlayer.equals("3") ) {
					players.add(new Player(txtNombreDelJugador1.getText(),  new ImageIcon(fichaAzul)));
					players.add(new Player(txtNombreDelJugador3.getText(), new ImageIcon(fichaAmarilla)));
					players.add(new Player(txtNombreDelJugador2.getText(), new ImageIcon(fichaVerde)));
					
				}		
				 
				if(numPlayer.equals("4") ) {
					players.add(new Player(txtNombreDelJugador1.getText(),  new ImageIcon(fichaAzul)));
					players.add(new Player(txtNombreDelJugador3.getText(), new ImageIcon(fichaAmarilla)));
					players.add(new Player(txtNombreDelJugador2.getText(), new ImageIcon(fichaVerde)));
					players.add(new Player(txtNombreDelJugador4.getText(), new ImageIcon(fichaRoja)));
					
				}	
				
				lblNumeroDeJugadores.setVisible(false);
				lblNombreDeJugadores.setVisible(false);
				txtNombreDelJugador1.setVisible(false);
				txtNombreDelJugador2.setVisible(false);
				txtNombreDelJugador3.setVisible(false);
				txtNombreDelJugador4.setVisible(false);
				lblAzul.setVisible(false);
				lblVerde.setVisible(false);
				lblAmarillo.setVisible(false);
				lblRojo.setVisible(false);
				btnSiguiente.setVisible(false);
				
				startGame(players);
			}
		});
		
	}
	
	// Game functions
	
	private void startGame(ArrayList<Player> players) {
		
		Game game = new Game(players);
		
		menuPanel.repaint();
		
		JLabel lblNombreDeJugadores = new JLabel(game.getPlayers().get(game.getPlayerTurn()).getName());
		lblNombreDeJugadores.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblNombreDeJugadores.setBounds(52, 50, 263, 50);
		menuPanel.add(lblNombreDeJugadores);
		
		JLabel lblColor = new JLabel(" ");
		lblColor.setIcon(game.getPlayers().get(game.getPlayerTurn()).getIcon());
		lblColor.setBounds(300, 150, 40, 40);
		menuPanel.add(lblColor);
		
		JLabel lblDado = new JLabel("Tira!");
		lblDado.setFont(new Font("Dialog", Font.BOLD, 40));
		lblDado.setBounds(52, 150, 263, 50);
		menuPanel.add(lblDado);
			
		JButton btnDado = new JButton("Dado");
		btnDado.setBounds(52, 250, 117, 25);
		menuPanel.add(btnDado);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(52, 300, 117, 25);
		btnSiguiente.setVisible(false);
		menuPanel.add(btnSiguiente);
		
		boardPanel.remove(boardLabel);
		boardPanel.repaint();
		
		
		for(Player player : game.getPlayers()) {
			for(Ficha ficha : player.getFichas()) {
				
				ficha.getLabel().setBounds(ficha.getCasaPosX(), ficha.getCasaPosY(), 40, 40);
				ficha.getLabel().setIcon(player.getIcon());
				ficha.getLabel().addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						int numInitFichas = 0, casillasMoved = 0;
						
						dado = game.getDado();
						
						if((player.isMove20() || player.isMove10()) && ficha.getPosNumber() > 0 && ficha.getPosNumber() < 99) {
							
							if(player.isMove10())
								casillasMoved = 10;
							
							if(player.isMove20())
								casillasMoved = 20;
							
							int pos = ficha.getPosNumber();
							int nextPos = checkLastCasillas(casillasMoved, pos, ficha);
							
							if(nextPos == 0) {
								 nextPos = pos + casillasMoved;
								 
								 if(nextPos > 68 && nextPos < 99) 
										nextPos %= 68;
									
								if(!checkBarrier(casillasMoved, pos, game.getCasillas())) 
									nextMovementFichaEnTablero(nextPos, pos, ficha, player, game.getCasillas());
								
							} else if(casillasMoved - nextPos < 9 && !(checkBarrier(nextPos, pos, game.getCasillas())) 
									&& !(checkBarrier(casillasMoved - nextPos, 0, player.getLastCasillas()))) {
							
								if(player.getLastCasillas().get(casillasMoved - nextPos).getFichasEnCasilla() == 1) {
									
									player.getLastCasillas().get(casillasMoved - nextPos).setBlock(true);
									
									ficha.getLabel().setBounds(player.getLastCasillas().get(casillasMoved - nextPos).getPosX2(),
											player.getLastCasillas().get(casillasMoved - nextPos).getPosY2(), 40, 40);
									
								} else if(player.getLastCasillas().get(casillasMoved - nextPos).getFichasEnCasilla() == 0) {
									
									ficha.getLabel().setBounds(player.getLastCasillas().get(casillasMoved - nextPos).getPosX1(),
											player.getLastCasillas().get(casillasMoved - nextPos).getPosY1(), 40, 40);
								}
								
								if(game.getCasillas().get(pos - 1).isBlock()) {
									
									game.getCasillas().get(pos - 1).setBlock(false);
									player.setBlock(false);
									
									for(Ficha ficha : player.getFichas()) {
										if(ficha.getPosNumber() != 0)
											if(game.getCasillas().get(ficha.getPosNumber() - 1).isBlock())
												player.setBlock(true);
									}
									
								}
								
								game.getCasillas().get(pos - 1).removeFichaFromCasilla(ficha);
								
								if(casillasMoved - nextPos != 8) 
									player.getLastCasillas().get(casillasMoved - nextPos).addFichaToCasillas(ficha);
								
								ficha.setPosNumber(100 + casillasMoved - nextPos);
								
								if(game.getCasillas().get(pos - 1).getFichas().size() == 1)
									game.getCasillas().get(pos - 1).getFichas().get(0).getLabel().setBounds(game.getCasillas().get(pos - 1).getPosX1(),
										game.getCasillas().get(pos - 1).getPosY1(), 40, 40);
								
								if(casillasMoved - nextPos == 0) {
									
									game.getCasillas().get(ficha.getCasillaFinal() - 1).addFichaToCasillas(ficha);
									
									if(game.getCasillas().get(ficha.getCasillaFinal() - 1).getFichasEnCasilla() == 1) {
									
										ficha.getLabel().setBounds(player.getLastCasillas().get(casillasMoved - nextPos).getPosX2(),
												player.getLastCasillas().get(casillasMoved - nextPos).getPosY2(), 40, 40);
										
										if(game.getCasillas().get(ficha.getCasillaFinal() - 1).getFichas().get(0).getPlayer().equals(player))
											game.getCasillas().get(ficha.getCasillaFinal() - 1).setBlock(true);
									}
								}
								
								if(casillasMoved - nextPos == 8) {
									
									player.setMove10(true);
									
								} else {
									player.setMove10(false);
								}
								
								player.setMove20(false);
								
							}
							
							
							
						}
						
						
						if(player.isMove() && !(numSeises == 3)) {
							
							//Comprobar si hay fichas en Casa
							for(Ficha ficha : player.getFichas()) 
								if (ficha.getPosNumber() == 0)
									numInitFichas++;
							
							//Dar una posicion mas si saca 6 y tiene a todas las casillas fuera
							if(numInitFichas == 0 && dado == 6) 
								dado = 7;
							
							//Evitamos error por posiciones mayores a 68
							int nextPos = 0, pos = ficha.getPosNumber();
							
							if(pos > 0 && pos < 69) 
								nextPos = pos + dado;
							if(pos == 0)
								nextPos = ficha.getInitPos();
							if(nextPos > 68) 
								nextPos %= 68;
							
							int lastCasillas = checkLastCasillas(dado, pos, ficha);
							
							if(lastCasillas > 0 || pos > 99) {
								
								if(lastCasillas > 0 && !checkBarrier(lastCasillas, pos, game.getCasillas()) 
										&& !checkBarrier(dado - lastCasillas, 0, player.getLastCasillas())) {
									
									if(player.getLastCasillas().get(dado - lastCasillas).getFichasEnCasilla() == 1) {
										
										player.getLastCasillas().get(dado - lastCasillas).setBlock(true);
										
										ficha.getLabel().setBounds(player.getLastCasillas().get(dado - lastCasillas).getPosX2(),
												player.getLastCasillas().get(dado - lastCasillas).getPosY2(), 40, 40);
									} else  if(player.getLastCasillas().get(dado - lastCasillas).getFichasEnCasilla() == 0){
										ficha.getLabel().setBounds(player.getLastCasillas().get(dado - lastCasillas).getPosX1(),
												player.getLastCasillas().get(dado - lastCasillas).getPosY1(), 40, 40);
									}
									
									if(game.getCasillas().get(pos - 1).isBlock()) {
										
										game.getCasillas().get(pos - 1).setBlock(false);
										player.setBlock(false);
										
										for(Ficha ficha : player.getFichas()) {
											if(ficha.getPosNumber() != 0)
												if(game.getCasillas().get(ficha.getPosNumber() - 1).isBlock())
													player.setBlock(true);
										}
										
									}
									
									game.getCasillas().get(pos - 1).removeFichaFromCasilla(ficha);
									player.getLastCasillas().get(dado - lastCasillas).addFichaToCasillas(ficha);
									ficha.setPosNumber(100 + dado - lastCasillas);
									
									if(game.getCasillas().get(pos - 1).getFichas().size() == 1)
										game.getCasillas().get(pos - 1).getFichas().get(0).getLabel().setBounds(game.getCasillas().get(pos - 1).getPosX1(),
											game.getCasillas().get(pos - 1).getPosY1(), 40, 40);
									
									if(dado - lastCasillas == 0) {
										
										game.getCasillas().get(ficha.getCasillaFinal() - 1).addFichaToCasillas(ficha);
										
										if(game.getCasillas().get(ficha.getCasillaFinal() - 1).getFichasEnCasilla() == 2) {
										
											ficha.getLabel().setBounds(player.getLastCasillas().get(dado - lastCasillas).getPosX2(),
													player.getLastCasillas().get(dado - lastCasillas).getPosY2(), 40, 40);
											
											if(game.getCasillas().get(ficha.getCasillaFinal() - 1).getFichas().get(0).getPlayer().equals(player))
												game.getCasillas().get(ficha.getCasillaFinal() - 1).setBlock(true);
										}
									}
									
									player.setBlock(false);
									
									
								} else if(pos + dado < 109 && pos > 99 && !checkBarrier(dado, pos, player.getLastCasillas())) {
									
									if(pos == 100) {
										
										game.getCasillas().get(ficha.getCasillaFinal() - 1).removeFichaFromCasilla(ficha);
										
										if(game.getCasillas().get(ficha.getCasillaFinal() - 1).getFichasEnCasilla() == 1)
											if(game.getCasillas().get(ficha.getCasillaFinal() - 1).getFichas().get(0).getPlayer().equals(player)) {
												
												game.getCasillas().get(ficha.getCasillaFinal() - 1).setBlock(false);
												player.setBlock(false);
												
												for(Ficha ficha : player.getFichas()) {
												
													if(ficha.getPosNumber() != 0)
														if(game.getCasillas().get(ficha.getPosNumber() - 1).isBlock())
															player.setBlock(true);
												
												}
											}
									}
									
									if(player.getLastCasillas().get((pos % 100) + dado).getFichasEnCasilla() == 1) {
										
										player.getLastCasillas().get((pos % 100) + dado).setBlock(true);
										
										ficha.getLabel().setBounds(player.getLastCasillas().get((pos % 100) + dado).getPosX2(),
												player.getLastCasillas().get((pos % 100) + dado).getPosY2(), 40, 40);
									} else {
										ficha.getLabel().setBounds(player.getLastCasillas().get((pos % 100) + dado).getPosX1(),
												player.getLastCasillas().get((pos % 100) + dado).getPosY1(), 40, 40);
									}
									
									if(player.getLastCasillas().get(pos % 100).isBlock()) 
										player.getLastCasillas().get(pos % 100).setBlock(false);
									
									player.getLastCasillas().get(pos % 100).removeFichaFromCasilla(ficha);
									
									if(pos + dado != 108) 
										player.getLastCasillas().get((pos % 100) + dado).addFichaToCasillas(ficha);
									
									ficha.setPosNumber(pos + dado);
									
									if(player.getLastCasillas().get((pos % 100) + dado).getFichasEnCasilla() == 2) 
										player.getLastCasillas().get((pos % 100) - 1).setBlock(true);
									
									if(ficha.getPosNumber() == 108) {
										player.setMove10(true);
									} else {
										player.setMove10(false);
									}
									
									player.setMove(false);
								}
								
								
								
							} else if(pos < 99  && !checkBarrier(dado, pos, game.getCasillas())) {
								
								if(dado == 5 && !(numInitFichas == 0)){ // Hay fichas en Casa y dado sea un 5;
									
									if(pos == 0) {//Esta ficha esta en Casa
										
										firstMovementFichasEnCasa(nextPos, pos, ficha, player, game);
										
									} else { //Esta ficha no esta en Casa
										
										if(game.getCasillas().get(ficha.getInitPos() - 1).getFichasEnCasilla() == 2) {
											// La casilla de salida esta llena
											nextMovementFichaEnTablero(nextPos, pos, ficha, player, game.getCasillas());
										}	
									}
									
								} else if(pos == 0){
									
								} else if(ficha.getPosNumber() < 99){
									boolean fichasBarrier[] = new boolean[4];
									int i = 0;
									
									if((dado == 6 || dado == 7) && player.isBlock()) {
										
										for(Ficha ficha: player.getFichas()) {
											
											if(ficha.getPosNumber() > 0 && game.getCasillas().get(ficha.getPosNumber() - 1).isBlock()) {
												fichasBarrier[i] = checkBarrier(dado, ficha.getPosNumber(), game.getCasillas());
											} else {
												fichasBarrier[i] = true;
											}
											
											i++;
										}
										
										if(game.getCasillas().get(pos - 1).isBlock()) {
											
											nextMovementFichaEnTablero(nextPos, pos, ficha, player, game.getCasillas());
											
										} else if(fichasBarrier[0] && fichasBarrier[1] && fichasBarrier[2] && fichasBarrier[3]) {
											
											nextMovementFichaEnTablero(nextPos, pos, ficha, player, game.getCasillas());
											
										}
										
									} else {
										nextMovementFichaEnTablero(nextPos, pos, ficha, player, game.getCasillas());
									}
									
								}
								
								
							}
							
							
							
						}
						
						
					}
				});
				boardPanel.add(ficha.getLabel());
	
			}
		}
		
		boardPanel.add(boardLabel);
			
		btnDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblDado.setText(Integer.toString(game.tirarDados()));
				
				if(game.getDado() == 6) {
					numSeises++;
				} else {
					numSeises = 0;
				}
				
				btnDado.setVisible(false);
				btnSiguiente.setVisible(true);

			}
		});
			

		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				game.getPlayers().get(game.getPlayerTurn()).setMove(false);
				game.getPlayers().get(game.getPlayerTurn()).setMove20(false);
				game.getPlayers().get(game.getPlayerTurn()).setMove10(false);
			
				boolean fichaDePlayer = false;
				
				for(Ficha ficha: game.getPlayers().get(game.getPlayerTurn()).getFichas()) {
					if(ficha.equals(ultimaFicha)) 
						fichaDePlayer = true;
				}

				
				if(numSeises == 3) {
										
					if(!fichaDePlayer) {
						ultimaFicha = null;
						
						for(Ficha ficha: game.getPlayers().get(game.getPlayerTurn()).getFichas()) {
							if(ficha.getPosNumber() > 0 && ficha.getPosNumber() < 99)
								ultimaFicha = ficha;
						}
					} 
					
					if(ultimaFicha != null) {
						game.getCasillas().get(ultimaFicha.getPosNumber() - 1).removeFichaFromCasilla(ultimaFicha);
						ultimaFicha.getLabel().setBounds(ultimaFicha.getCasaPosX(), ultimaFicha.getCasaPosY(), 40, 40);
						ultimaFicha.setPosNumber(0);
					}
											
					numSeises = 0;
					
				}
				
				int numFichasFinished = 0;
				
				for(Ficha fichaFinished : game.getPlayers().get(game.getPlayerTurn()).getFichas()) {
					if(fichaFinished.getPosNumber() == 108) {
						
						fichaFinished.getLabel().setBounds(game.getPlayers().get(game.getPlayerTurn()).getLastCasillas().get(8).getPosX2() + (50*numFichasFinished), 
								game.getPlayers().get(game.getPlayerTurn()).getLastCasillas().get(8).getPosY2(), 40, 40);
						
						numFichasFinished++;
						
					}
				}
				
				if(numFichasFinished == 4) {
					game.removePlayer(game.getPlayerTurn());
					game.setPlayerTurn(game.getPlayerTurn() - 1);
				}

				
				if(numSeises == 0) {					
					game.setPlayerTurn((game.getPlayerTurn() + 1) % players.size());
					lblNombreDeJugadores.setText(game.getPlayers().get(game.getPlayerTurn()).getName());
				}
				
				
				lblColor.setIcon(game.getPlayers().get(game.getPlayerTurn()).getIcon());
				lblDado.setText("Tira !");
				
				btnSiguiente.setVisible(false);
				btnDado.setVisible(true);
				
			}
		});
	
	}
	
	private void firstMovementFichasEnCasa(int nextPos, int pos, Ficha f, Player p, Game game) {
		if(game.getCasillas().get(nextPos - 1).getFichasEnCasilla() == 0) {
			//No hay fichas en la posicion inicial
			
			f.getLabel().setBounds(game.getCasillas().get(nextPos - 1).getPosX1(),
					game.getCasillas().get(nextPos - 1).getPosY1(), 40, 40);
			
			f.setPosNumber(nextPos);
			game.getCasillas().get(nextPos - 1).addFichaToCasillas(f);
			
			p.setMove(false);
			
			
		} else if(game.getCasillas().get(nextPos - 1).getFichasEnCasilla() == 1) {
			// Hay una ficha en la posicion inicial
			
			f.getLabel().setBounds(game.getCasillas().get(nextPos - 1).getPosX2(),
					game.getCasillas().get(nextPos - 1).getPosY2(), 40, 40);
			
			if(game.getCasillas().get(nextPos - 1).getFichas().get(0).getPlayer().equals(p)) {
				game.getCasillas().get(nextPos - 1).setBlock(true);
				p.setBlock(true);
			}
			
			f.setPosNumber(nextPos);
			game.getCasillas().get(nextPos - 1).addFichaToCasillas(f);
			
			p.setMove(false);
			
		} else if(game.getCasillas().get(nextPos - 1).getFichasEnCasilla() == 2) {
			// Hay dos fichas en la posicion inicial y una es de otro color
			
			//La ultima ficha en entrar muere (si no es del mismo color)
			if(!game.getCasillas().get(nextPos - 1).getFichas().get(1).getPlayer().equals(p)) {
				
				game.getCasillas().get(nextPos - 1).getFichas().get(1).getLabel().setBounds(
						game.getCasillas().get(nextPos - 1).getFichas().get(1).getCasaPosX(),
						game.getCasillas().get(nextPos - 1).getFichas().get(1).getCasaPosY(), 40, 40);
				game.getCasillas().get(nextPos - 1).getFichas().get(1).setPosNumber(0);
				game.getCasillas().get(nextPos - 1).removeFichaFromCasilla(game.getCasillas().get(nextPos - 1).getFichas().get(1));
				
				f.getLabel().setBounds(game.getCasillas().get(nextPos - 1).getPosX2(),
						game.getCasillas().get(nextPos - 1).getPosY2(), 40, 40);
				
				if(game.getCasillas().get(nextPos - 1).getFichas().get(0).getPlayer().equals(p)) {
					game.getCasillas().get(nextPos - 1).setBlock(true);
					p.setBlock(true);
				}
				
				f.setPosNumber(nextPos);
				game.getCasillas().get(nextPos - 1).addFichaToCasillas(f);
				
				p.setMove(false);
				p.setMove20(true);
				
			} else if(!game.getCasillas().get(nextPos - 1).getFichas().get(0).getPlayer().equals(p)){
				
				game.getCasillas().get(nextPos - 1).getFichas().get(0).getLabel().setBounds(
						game.getCasillas().get(nextPos - 1).getFichas().get(0).getCasaPosX(),
						game.getCasillas().get(nextPos - 1).getFichas().get(0).getCasaPosY(), 40, 40);
				game.getCasillas().get(nextPos - 1).getFichas().get(0).setPosNumber(0);
				game.getCasillas().get(nextPos - 1).removeFichaFromCasilla(game.getCasillas().get(nextPos - 1).getFichas().get(0));
				
				f.getLabel().setBounds(game.getCasillas().get(nextPos - 1).getPosX1(),
						game.getCasillas().get(nextPos - 1).getPosY1(), 40, 40);
				
				f.setPosNumber(nextPos);
				game.getCasillas().get(nextPos - 1).addFichaToCasillas(f);
				
				if(game.getCasillas().get(nextPos - 1).getFichas().get(0).getPlayer().equals(p)) {
					game.getCasillas().get(nextPos - 1).setBlock(true);
					p.setBlock(true);
				} else {
					Ficha fichaAux = game.getCasillas().get(nextPos - 1).getFichas().get(0);
					game.getCasillas().get(nextPos - 1).getFichas().remove(fichaAux);
					game.getCasillas().get(nextPos - 1).getFichas().add(fichaAux);
				}
				
				
				
				p.setMove(false);
				p.setMove20(true);
			}
			
		}
	}
	
	private void nextMovementFichaEnTablero(int nextPos, int pos, Ficha f, Player p, ArrayList<Casilla> casillas) {
		
		
		if(casillas.get(nextPos - 1).getFichasEnCasilla() == 0) {
			//No hay fichas en la siguiente posicion 
			
			f.getLabel().setBounds(casillas.get(nextPos - 1).getPosX1(),
					casillas.get(nextPos - 1).getPosY1(), 40, 40);
			
			if(casillas.get(pos - 1).isBlock()) {
				
				casillas.get(pos - 1).setBlock(false);
				p.setBlock(false);
				
				for(Ficha ficha : p.getFichas()) {
					if(ficha.getPosNumber() != 0)
						if(casillas.get(ficha.getPosNumber() - 1).isBlock())
							p.setBlock(true);
				}
				
			}
			
			casillas.get(pos - 1).removeFichaFromCasilla(f);
			f.setPosNumber(nextPos);
			casillas.get(nextPos - 1).addFichaToCasillas(f);
			
			if(casillas.get(pos - 1).getFichas().size() == 1)
				casillas.get(pos - 1).getFichas().get(0).getLabel().setBounds(casillas.get(pos - 1).getPosX1(),
					casillas.get(pos - 1).getPosY1(), 40, 40);
			
			p.setMove(false);
			p.setMove10(false);
			p.setMove20(false);
			ultimaFicha = f;
															
		} else if(casillas.get(nextPos - 1).getFichasEnCasilla() == 1) {
			// Hay una ficha en la siguiente posicion 
			
			if(!casillas.get(nextPos - 1).isSave() && 
					!casillas.get(nextPos - 1).getFichas().get(0).getPlayer().equals(p)) {
				
				casillas.get(nextPos - 1).getFichas().get(0).getLabel().setBounds(
						casillas.get(nextPos - 1).getFichas().get(0).getCasaPosX(),
						casillas.get(nextPos - 1).getFichas().get(0).getCasaPosY(), 40, 40);
				casillas.get(nextPos - 1).getFichas().get(0).setPosNumber(0);
				casillas.get(nextPos - 1).removeFichaFromCasilla(casillas.get(nextPos - 1).getFichas().get(0));
				
				f.getLabel().setBounds(casillas.get(nextPos - 1).getPosX1(),
						casillas.get(nextPos - 1).getPosY1(), 40, 40);
				p.setMove20(true);
				
			} else {
				
				f.getLabel().setBounds(casillas.get(nextPos - 1).getPosX2(),
						casillas.get(nextPos - 1).getPosY2(), 40, 40);
				p.setMove20(false);
			}
			
			if(casillas.get(pos - 1).isBlock()) {
				
				casillas.get(pos - 1).setBlock(false);
				p.setBlock(false);
				
				for(Ficha ficha : p.getFichas()) {
					if(ficha.getPosNumber() != 0)
						if(casillas.get(ficha.getPosNumber() - 1).isBlock())
							p.setBlock(true);
				}
				
				
			}
			if(casillas.get(nextPos - 1).getFichas().size() != 0)
				if(casillas.get(nextPos - 1).getFichas().get(0).getPlayer().equals(p)) {
				
					casillas.get(nextPos - 1).setBlock(true);
					p.setBlock(true);
				}
			
			casillas.get(pos - 1).removeFichaFromCasilla(f);
			f.setPosNumber(nextPos);
			casillas.get(nextPos - 1).addFichaToCasillas(f);
			
			if(casillas.get(pos - 1).getFichas().size() == 1)
				casillas.get(pos - 1).getFichas().get(0).getLabel().setBounds(casillas.get(pos - 1).getPosX1(),
					casillas.get(pos - 1).getPosY1(), 40, 40);
			
			p.setMove10(false);
			p.setMove(false);
			ultimaFicha = f;

		}
		
	}
	
	private boolean checkBarrier(int casillasMoved, int pos, ArrayList<Casilla> casillas) {
		int i = 1;
		
		while(casillasMoved >=  i && pos > 0) {
			if(pos + i < 69) {
				if(casillas.get(pos + i - 1).isBlock())
					return true;
			} else if(pos + i < 99){
				if(casillas.get(((pos + i) % 68) - 1).isBlock())
					return true;
			} else if (pos + i > 99) {
				if(casillas.get((pos + i) % 100).isBlock())
					return true;
			}
			i++;
		}
		return false;
	}
	
	private int checkLastCasillas(int casillasMoved, int pos, Ficha ficha) {
		int i = 1;
		
		while(casillasMoved >=  i && pos > 0) {
			if(pos + i < 69) {
				if(pos + i == ficha.getCasillaFinal())
					return i;
			}
			i++;
		}
		return 0;
	}
	
}

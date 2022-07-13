package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Rian-Furtado

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("2D Adventure"); 

		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);

		window.pack(); // Faz com que esta janela seja dimensionada para
		//  se ajustar ao tamanho e layouts preferidos de seus subcomponentes( = GamePanel)

		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.setupGame();
		
		gamePanel.startGameThread(); 

	}

}

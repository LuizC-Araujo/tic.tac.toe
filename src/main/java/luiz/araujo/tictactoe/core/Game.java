package luiz.araujo.tictactoe.core;

import luiz.araujo.tictactoe.ui.UI;

public class Game {
	Board board = new Board();
	//Player[] players = new Player[2];
	
	
	public void play() {
		UI.printGameTitle();
		
		board.print();
	}
}

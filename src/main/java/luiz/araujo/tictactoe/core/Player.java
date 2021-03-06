package luiz.araujo.tictactoe.core;

import luiz.araujo.tictactoe.ui.UI;

public class Player {
	private String name;
	private Board board;
	private char symbol;
	
	
	
	public Player(String name, Board board, char symbol) {
		this.name = name;
		this.board = board;
		this.symbol = symbol;
	}

	private Move inputMove() {
		String moveStr = UI.readInput("Jogador '" + name + "' => ");
		return new Move(moveStr);
	}
	
	public void play() {
		Move move = inputMove();
		board.play(this, move);
	}
	
	public char getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}
}

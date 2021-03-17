package luiz.araujo.tictactoe.core;

import luiz.araujo.tictactoe.ui.UI;

public class Board {
	private char[][] matrix;
	
	public Board() {
		matrix = new char[3][3];
		clear();
	}

	public void clear(){
		for (int linha = 0; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
				matrix[linha][coluna] = ' ';
			}
		}
	}
	
	public void print() {
		UI.printNewLine();
		
		for (int linha = 0; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
				UI.printTextWhiNoNewLine(String.valueOf(matrix[linha][coluna]));
				if(coluna < matrix[linha].length - 1) 
					UI.printTextWhiNoNewLine(" | ");
			}
			
			UI.printNewLine();
			if(linha < matrix.length - 1)
				UI.printText("---------");
		}
	}
	
	public boolean isFul() {
		for (int linha = 0; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
				if(matrix[linha][coluna] == ' ')
					return false;
			}
		}
		return true;
	}
	
	public boolean play(Player player, Move move) {
		int i = move.getI();
		int j = move.getJ();
		
		//TODO validar movimentos
		
		matrix[i][j] = player.getSymbol();
	
		return checkRows(player) || checkCols(player) || checkDiagonal1(player) || checkDiagonal(player);
	}
	
	private boolean checkRows(Player player) {
		for (int i = 0; i < 3; i++) {
			if(checkrRow(i, player)) {
				return true;
			}
		}
		return false;
	}
	private boolean checkCols(Player player) {
		for (int j = 0; j < 3; j++) {
			if(checkrCol(j, player)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkrRow(int i, Player player) {
		char symbol = player.getSymbol();
		for(int j = 0; j < 3; j++) {
			if(matrix[i][j] != symbol)
				return false;
		}
		return true;
	}
	
	private boolean checkrCol(int j, Player player) {
		char symbol = player.getSymbol();
		for(int i = 0; i < 3; i++) {
			if(matrix[i][j] != symbol)
				return false;
		}
		return true;
	}
	
	private boolean checkDiagonal1(Player player) {
		char symbol = player.getSymbol();
		for(int i = 0; i < 3; i++) {
			if(matrix[i][i] != symbol)
				return false;
		}
		return true;
	}
	
	private boolean checkDiagonal(Player player) {
		char symbol = player.getSymbol();
		for(int i = 2, j = 0; i >= 0; i--, j++) {
			if(matrix[i][j] != symbol)
				return false;
		}
		return true;
	}
}	

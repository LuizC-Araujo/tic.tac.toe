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
		
		matrix[i][j] = player.getSymbol();
		
		//TODO checar se o jogador venceu
		return false;
	}
	
}

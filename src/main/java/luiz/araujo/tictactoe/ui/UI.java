package luiz.araujo.tictactoe.ui;

import java.util.Scanner;

public class UI {
	static Scanner input = new Scanner(System.in);
	
	public static void printText(String text){
		System.out.println(text);
	}
	
	public static void printTextWhiNoNewLine(String text) {
		System.out.print(text);
	}
	
	public static void printNewLine() {
		System.out.println();
	}
	
	public static void printGameTitle() {
		printText("============================");
		printText("|        JOGO DA VELHA     |");
		printText("============================");
		printNewLine();
	}
	
	public static String readInput(String text) {
		printTextWhiNoNewLine(text + " ");
		return input.nextLine();
	}
	
	
}

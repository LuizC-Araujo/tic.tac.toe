package luiz.araujo.tictactoe.core;

public class Move {
	private int i;
	private int j;
	
	public Move(String moveStr) {
		String[] tokens = moveStr.split(",");
		
		this.i = Integer.parseInt(tokens[0]);
		this.i = Integer.parseInt(tokens[1]);
		
		//TODO validade se a estrutura est� correta
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getJ() {
		return j;
	}
	
	public void setJ(int j) {
		this.j = j;
	}
}

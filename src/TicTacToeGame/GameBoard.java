package TicTacToeGame;

import java.util.*;

public class GameBoard {

	Map<String, String> board = new HashMap<String, String> ();

	public GameBoard() {
		this.createBoard();
	}
	
	public void createBoard() {
		this.board.put("0,0", " ");
		this.board.put("2,0", " ");
		this.board.put("4,0", " ");
		this.board.put("0,2", " ");
		this.board.put("2,2", " ");
		this.board.put("4,2", " ");
		this.board.put("0,4", " ");
		this.board.put("2,4", " ");
		this.board.put("4,4", " ");
	}
	
	public void clearBoard() {
		for (String coord : board.keySet()) {
			board.put(coord, " ");
		}
	}
	
	public void display() {
		for(int y = 0; y < 5; y++) {
			System.out.print(" ");
			if (y == 1 || y == 3) {
				System.out.println("-----");
				continue;
			}
			for(int x = 0; x < 5; x++) {
				if (x == 1 || x == 3) {
					System.out.print("|");
				}
				else {
					String spot = checkSpot(x, y);
					System.out.print(spot);
				}
			}
			System.out.println("");
		}
	}
	
	public String checkSpot(int x, int y) {
		String _spot = x + "," + y;
		return board.get(_spot);
	}
	
	public void addO(String coord) {
		this.board.put(coord, "O");
	}
	
	public void addX(String coord) {
		this.board.put(coord, "X");
	}
}

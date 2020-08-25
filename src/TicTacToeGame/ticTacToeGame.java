package TicTacToeGame;

public class ticTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameBoard gameBoard = new GameBoard();
		boolean playing = true;
		Player player1 = new Player("1", "X");
		Player player2 = new Player("2", "O");
		String coord = null;
		while(playing) {
			gameBoard.display();
			coord = player1.getUserInput(gameBoard);
			if(coord != null) { 
				gameBoard.addX(coord);
			}
			System.out.println("\n\n\n");
			gameBoard.display();
			coord = player2.getUserInput(gameBoard);
			if(coord != null) { 
				gameBoard.addO(coord);
			}
			System.out.println("\n\n\n");
		}

	}

}

package TicTacToeGame;

import java.util.*;

public class Player {
	
	String name;
	String letter;
	
	public Player(String newName, String newLetter) {
		name = newName;
		letter = newLetter;
	}
	
	public String getUserInput(GameBoard gameBoard) {
	
		boolean validInput = false;
		String coord = null;
		while (validInput == false) {
			System.out.print("\n\nPlayer " + this.name + " Enter in Y level (Top, Middle, Bottom): ");
			Scanner usrConIn = new Scanner(System.in);
			String usrY = usrConIn.nextLine();
			System.out.print("Enter in X level (Left, Middle, Right): ");
			String usrX = usrConIn.nextLine();
			usrConIn.close();
			
			String tempY = transYUsrStr(usrY);
			String tempX = transXUsrStr(usrX);
			
			if(tempX == null || tempY == null) {
				System.out.println("You must enter valid options for X and Y levels\n");
				continue;
			}
			else {
				coord = tempX + "," + tempY;
				if(gameBoard.board.containsKey(coord) == false) {
					System.out.println("Invalid combination\nYou must enter valid options for X and Y levels\n");
					continue;
				}
				if(gameBoard.board.get(coord) != " ") {
					System.out.println("Spot is already filled\nYou must enter valid options for X and Y levels\n");
					continue;
				}
				validInput = true;
			}
		}
		return coord;
	}
	
	public String transYUsrStr(String rawStr) {
		String transCoord = null;
		switch (rawStr) {
			case "Top":
			case "top":
				transCoord = "0";
				break;
			case "Middle":
			case "middle":
				transCoord = "2";
				break;
			case "Bottom":
			case "bottom":
				transCoord = "4";
				break;
			default:
				System.out.println("Invalid Y selection made");
	}
		return transCoord;
	}
	
	public String transXUsrStr(String rawStr) {
		String transCoord = null;
		switch (rawStr) {
			case "Left":
			case "left":
				transCoord = "0";
				break;
			case "Middle":
			case "middle":
				transCoord = "2";
				break;
			case "Right":
			case "right":
				transCoord = "4";
				break;
			default:
				System.out.println("Invalid X selection made");
	}
		return transCoord;
	}
	
}

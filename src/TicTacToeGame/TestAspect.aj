package TicTacToeGame;

public aspect TestAspect {
	before(): execution(* *.display()) {
		System.out.println("My Aspect");
	}
}


public class GuessingGameChallenge{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessingGame g = new GuessingGame();
		GuessingGame b = new GuessingGame();
		GuessingGame c = new GuessingGame();
		System.out.println("Game #1");
		if(g.isWinningNumber(2)) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lose");
		}
		if(g.isWinningNumber(3)) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lose");
		}
		if(g.isWinningNumber(4)) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lose");
		}
		System.out.println("Game #2");
		if(b.isWinningNumber(1)) {
			System.out.println("You Win");
		}
		else {
			System.out.println("You Lose");
		}
		if(b.isWinningNumber(5)) {
			System.out.println("You Win");
		}
		else {
			System.out.println("You Lose");
		}if(b.isWinningNumber(2)) {
			System.out.println("You Win");
		}
		else {
			System.out.println("You Lose");
		}
		System.out.println("Game #3");
		if(c.isWinningNumber(5)) {
			System.out.println("You Win");
		}
		else {
			System.out.println("You Lose");
		}
		
	}

}

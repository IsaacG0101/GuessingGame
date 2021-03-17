import java.util.Random;

public class GuessingGame extends Game {
	Random generator;
	public GuessingGame() {
		generator = new Random();
		newGame();
	}
	int winningNumber,numberOfTries,lastGuess;
	public boolean  isWinningNumber (int i)  {
		
		if( i > 5 || i < 1) {
		//	throw new InvalidPickException(i + "is not valid");
		}
		else {
			numberOfTries ++;
			lastGuess = i;
		}
		
		if(i == winningNumber && numberOfTries <= 2) {
			
			return true;
		}
		
		return false;
	}

	public void setWinningNumber(int winningNumber) {
		this.winningNumber = winningNumber;
	}
	public int getNumberOfTries() {
		return numberOfTries;
	}
	public void setNumberOfTries(int numberOfTries) {
		this.numberOfTries = numberOfTries;
	}
	public int getLastGuess() {
		return lastGuess;
	}
	public void setLastGuess(int lastGuess) {
		this.lastGuess = lastGuess;
	}
	@Override
	public boolean isGameOver() {
		if (lastGuess == winningNumber) {
			return true;
		}
		if (numberOfTries == 2) {
			System.out.println("You Lost Game Over");
		return true;
		}
		return false;
	}
	public final void newGame() {
		numberOfTries = 0;
		lastGuess = 0;
		winningNumber = generator.nextInt(5)+1;
	}
	
	

}

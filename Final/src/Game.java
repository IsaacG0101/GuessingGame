
public abstract class Game {
			String playerName;
			public void newGame() {
				
			}
			public abstract boolean isGameOver();

			public void setPlayerName(String s) {
				this.playerName =s;
			}
			public String getPlayerName() {
				return playerName;
			}
}
import java.util.Scanner;

public class Human extends Player {
	
	protected static int winCount;
	protected static int lossCount;
	protected static int drawCount;

	public Roshambo generateRoshambo() {
		Scanner scan1 = new Scanner(System.in);
		String humanChoice = Validator.getString(scan1, "Rock, Paper, or scissors? (R/P/S)", "R", "P", "S");
		if (humanChoice.equalsIgnoreCase("R")) {
			this.setRoshValue(Roshambo.ROCK); //connect with enum
		} else if (humanChoice.equalsIgnoreCase("P")) {
			this.setRoshValue(Roshambo.PAPER);//connect with enum
		} else {
			this.setRoshValue(Roshambo.SCISSORS);//connect with enum
		}
		return roshValue;
	}

	public static int getWinCount() {
		return winCount;
	}

	public static void setWinCount(int winCount) {
		Human.winCount = winCount;
	}

	public static int getLossCount() {
		return lossCount;
	}

	public static void setLossCount(int lossCount) {
		Human.lossCount = lossCount;
	}

	public static void setDrawCount(int drawCount) {
		Human.drawCount = drawCount;
	}
	
	public static int getDrawCount() {
		return drawCount;
	}
	
}
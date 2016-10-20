import java.util.Scanner;

public class RoshamboApp {
	
	//Paired Programming: Sarah Mitchell and Faisal Qayumi

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Enter your name: ");
		Human human = new Human();
		Human.setWinCount(0);
		Human.setLossCount(0);
		Human.setDrawCount(0);
		human.name = scan.nextLine();
		//System.out.println(human.name);
		
		String again = "Y";
		do {
			//System.out.println("Would you like to play Randy or Lemmy? (R/L):");
			String opponent = Validator.getString(scan, "Would you like to play Randy or Lemmy? (R/L):", "R", "L");
			if ((opponent.equalsIgnoreCase("R")) || (opponent.equalsIgnoreCase("Randy"))) {
				Randy opp = new Randy();
				playRPS(human, opp);
				System.out.println("You have: " + Human.winCount + " wins, " 
						+ Human.lossCount + " losses, " + Human.drawCount + " draws.");
				System.out.println("Would you like to play again? Y/N ");
				again = scan.nextLine();
			} else if ((opponent.equalsIgnoreCase("L")) || (opponent.equalsIgnoreCase("Lemmy"))) {
				Lemmy opp = new Lemmy();
				playRPS(human, opp);
				System.out.println("You have: " + Human.winCount + " wins, " 
								+ Human.lossCount + " losses, " + Human.drawCount + " draws.");
				System.out.println("Would you like to play again? Y/N ");
				again = scan.nextLine();
			} else {
				System.out.println("Your final results were: " + Human.winCount + " wins, " 
						+ Human.lossCount + " losses, " + Human.drawCount + " draws.");
				System.out.println("Goodbye!");
			} 
		} while (again.equalsIgnoreCase("Y"));
		scan.close();

	}

	public static void playRPS(Human p1, Player p2) {
		p1.generateRoshambo();
		p2.generateRoshambo();
		System.out.println(p1.name + " played " + p1.roshValue + ".");
		System.out.println(p2.name + " played " + p2.roshValue + ".");
		if (((p1.roshValue.toString().equals("ROCK")) && (p2.roshValue.toString().equals("SCISSORS"))) ||
			(p1.roshValue.toString().equals("PAPER")) && (p2.roshValue.toString().equals("ROCK")) ||
			 (p1.roshValue.toString().equals("SCISSORS")) && (p2.roshValue.toString().equals("PAPER")))
			 {
			System.out.println(p1.name + " wins!");
			Human.winCount++;
			
		} else if (((p2.roshValue.toString().equals("ROCK")) && (p1.roshValue.toString().equals("SCISSORS"))) ||
				(p2.roshValue.toString().equals("PAPER")) && (p1.roshValue.toString().equals("ROCK")) ||
				 (p2.roshValue.toString().equals("SCISSORS")) && (p1.roshValue.toString().equals("PAPER")))
				 {
				System.out.println(p2.name + " wins!");
				Human.lossCount++;
			} else  {
					System.out.println("Tie!");
					Human.drawCount++;
				}
	}
	
}
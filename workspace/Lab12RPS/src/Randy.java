public class Randy extends Player {
	
	

	public Randy() {
		super();
		name = "Randy";
	}

	public Roshambo generateRoshambo() {
		int randInt = (int)(Math.random() *3 + 1);
		if (randInt == 1) {
			this.setRoshValue(Roshambo.ROCK); //this should connect to enum somehow
		} else if (randInt == 2) {
			this.setRoshValue(Roshambo.PAPER); //this should connect to enum somehow
		} else {
			this.setRoshValue(Roshambo.SCISSORS); //this should connect to enum somehow
		}
		return roshValue;
	}
}
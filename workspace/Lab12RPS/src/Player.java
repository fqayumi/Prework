public abstract class Player {
	public String name;
	public Roshambo roshValue; //should this remain static? 

	
public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getRoshValue() {
		return roshValue;
	}

	public void setRoshValue(Roshambo roshValue) {
		this.roshValue = roshValue;
	}

public abstract Roshambo generateRoshambo();


}
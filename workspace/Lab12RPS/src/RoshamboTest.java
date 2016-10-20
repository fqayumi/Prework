public class RoshamboTest {
	
	    public static void main(String [] args) {
	    		Roshambo r = Roshambo.ROCK;
	    		
	    		switch (r) {
	            case ROCK:
	                System.out.println("Rock!");
	                break;
	                    
	            case PAPER:
	                System.out.println("Paper!");
	                break;
	                         
	            case SCISSORS:
	                System.out.println("Scissors");
	                break;
	                        
	            default:
	                System.out.println("That's not a thing.");
	                break;
	        }
	    }    
}
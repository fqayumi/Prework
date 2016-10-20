import java.util.ArrayList;
import java.util.Scanner;

public class WordSmith {

	//creating array list and adding the required word to list when requirements met
	public ArrayList<String> getWord(int i){
		ArrayList <String> dividable = new ArrayList<String>();
		//testing for remainders when integer is entered
		if(i%3 == 0)
		{
			dividable.add("word");
		}
		if (i%5 == 0)
		{
			dividable.add("smith");
		}
		if (i%15 == 0 )
		{
			dividable.add("wordsmith");
		}
		//adding same integer to array list when no requirements above are met
		if (dividable.size() == 0)
		{
			dividable.add(String.valueOf(i));
		}
		return dividable;
}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any integer: ");
		int i = scanner.nextInt();
		WordSmith wordSmith = new WordSmith();
		//calling getWord method to test the integer typed
		System.out.println(wordSmith.getWord(i));	
	}
}
	

 

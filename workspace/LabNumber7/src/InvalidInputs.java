import java.util.Scanner;
import java.util.InputMismatchException;

public class InvalidInputs 
{
	public static void main(String[] args) //throws ArrayIndexOutOfBoundsException 
	{
		String[] names = {"Peter", "Heather", "Cid", "Maurice", "Kristen", "Patrick", "Dylan", "Justin", "Keegan", "Jaime", "Sarah", "Omar", "Steve", "Rachel", "Faisal", "Kim", "Tricia", "Sam", "Rob", "Meera","Ian"};
		String[] foods = {"Tacos", "French Fries", "Hamburger", "Chicken", "Cheeseburger", "Chinese", "Pizza", "Italian", "Pancakes", "Wings", "Chips", "Sushi", "Burritos", "Cake", "Cookies", "Brisket", "Falafel", "Brownies", "Cereal", "Cuban", "Indian"};
		String[] hometown = {"Detroit", "Lansing", "Ann Arbor", "Livonia", "Farmington", "Flint", "Columbia", "Laurel", "Baltimore", "Washington", "Canton", "Deerborn", "Alexandria", "Chicago", "Catonsville", "Elkridge", "Hyattsville", "Pittsburgh", "Annapolis", "Toledo", "Las Vegas"};
		String another = "y";
		while(another.equalsIgnoreCase("y"))
		{
			System.out.println("Welcome to our Java Class. Which student would you like to learn about? (Enter a number 0-20)");
			
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			if (n > 20 || n < 0)
			{
			System.out.println("Please enter a vaild number from (0-20)");
			n = scan.nextInt();
			scan.nextLine();
			}
			
			System.out.println("Student " + n + " is " + names[n]);
			System.out.println("What you like to know about " + names[n] + "? " + ("enter hometown or favorite food"));
			scan.nextLine();
			String choice = scan.nextLine();
			if(choice.equalsIgnoreCase("hometown"))
			{
				System.out.println(names[n] + " hometown is " + hometown[n]);
				System.out.println("Would you like to know more about " + names[n] + "(yes or no)");
				String more = scan.nextLine();
			if(more.equalsIgnoreCase("yes"))
			{
				System.out.println(names[n] + " favorite food is " + foods[n]);
			}
			
			}
			if(choice.equalsIgnoreCase("favorite food"))
			{
			System.out.println(names[n] + " favorite food is " + foods[n]);
			System.out.println("Would you like to know more about " + names[n] + "(yes or no)");
			String more = scan.nextLine();
				if(more.equalsIgnoreCase("yes"))
				{
				System.out.println(names[n] + " hometown is  " + hometown[n]);
				}
			}
			System.out.println("Would you like to learn about another student? (y or n)");
			another = scan.nextLine();
			
			
			
		}
		
		System.out.println("Thank You, Good-Bye!");
		//scan.close();
	}
	//scan.close();
}

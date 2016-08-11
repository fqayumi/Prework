import java.util.Scanner;

public class Adventure 
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to your adventure!");
		System.out.print("What is your name? ");
		String name = scan.nextLine();
		
		System.out.print(name + ", would you like to go on an adventure");
		String playChoice = scan.nextLine();
		if(playChoice.equalsIgnoreCase("no"))
		{
			System.out.println("BOOOOORINGGGG, CYAAA");
			scan.close();
			return;
		}
		System.out.println("Here we go, you are walking into the forest and encounter a fire breathing dragon");
		System.out.println("Time to choose a weapon : sword, rocket launcher, or crossbow ");
		String weapon = scan.nextLine();
		if (weapon.equalsIgnoreCase("rocket launcher"))
		{
			System.out.println("The rocket launcher killed the dragon but you did not survive the blast either");
			System.out.println("Better luck next time, choose your weapon wisely next time");
			
			scan.close();	
		}
		else if(weapon.equalsIgnoreCase("sword"))
		{
			System.out.println("Great Choice, Lets Battle!");
			System.out.println("Do you want to attack or defend?");
			String strategy = scan.nextLine();
			if (strategy.equalsIgnoreCase("defend"))
			{
				System.out.println("Your defenses are no match for fire, the dragon has burnt you to the ground" );
				scan.close();
			}
			else if(strategy.equalsIgnoreCase("attack"))
			{
				System.out.println("You have stabbed the dragon through the heart YOU ARE VICTORIOUS!!!! You have survived this battle");
				System.out.println("See you on the next adventure, good-bye");
				scan.close();
			}
		}
		else if(weapon.equalsIgnoreCase("crossbow"))
		{
			System.out.println("Time to Battle");
			System.out.println("Would you like to shoot for high, middle or low? ");
			String attack = scan.nextLine();
			if(attack.equalsIgnoreCase("high"))
			{
				System.out.println("You had a direct hit to the head but one shot was not enough");
				System.out.println("The dragon was injured but you were killed after from his firey exhale");
				System.out.println("Better luck next time");
			}
			else if(attack.equalsIgnoreCase("Middle"))
			{
				System.out.println("GREAT SHOT, direct hit to the heart you have defeated the dragon");
				System.out.println("Nice fighting, good luck in battles to come, Safe Travels");
			}
			else if(attack.equalsIgnoreCase("Low"))
			{
				System.out.println("You shot the dragon in the leg and paralyzed him, but he was still have to breath fire");
				System.out.println("You are greatly injured would you like to fire another shot or call for a rescue (type rescue or fire)");
				String choice = scan.nextLine();
					if(choice.equalsIgnoreCase("rescue"))
							{
								System.out.println("A helicopter spotted you and rescued back to civilization");
								System.out.println("You have survived this adventure with minor burns, safe travels in the future!!");
								
							}
					else 
					{
						System.out.println("Your second shot was successful you have killed the dragon!!!");
						System.out.println("You have survived this battle with minor injuries and also removed the dangerous dragon from the forest");
						System.out.println("Congratulation, safe travels in future adventures");
					}
			}
		}
		scan.close();
		
	}
}


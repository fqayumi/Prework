
	import java.io.IOException;
	import java.util.Scanner;

	public class CountriesApp {

		public static void main(String[] args) throws IOException {
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the Countries Maintenance Application!");
			int options = 1;
			do {
				System.out.println("Would you like to see list of countries(type 1)" + "\n" + "Add a country  (type 2)" + "\n" +  "Exit (type 3)"+ "\n");

				int choice = scan.nextInt();

				if (choice == 1) {
					CountriesTextFile listOfCountries = new CountriesTextFile();
					listOfCountries.readCountries();
					
				}
					if (choice == 2) {
						System.out.print("Please Enter country: ");
						String add = scan.next();
						CountriesTextFile listOfCountries = new
						CountriesTextFile();
						listOfCountries.addCountry(add);

						System.out.println("The country has been saved!");
				
					
					}
				} while (options == 3 );
			scan.close();
			System.out.println("Good Bye");
			
		}
		
}


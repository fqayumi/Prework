import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDifference {

	public static void main(String[] args) {
	System.out.println("Welcome to Calender Date Calculator");
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter first date mm dd yyyy: ");
	int mm = scanner.nextInt();
	int dd = scanner.nextInt();
	int yyyy = scanner.nextInt();
	
	LocalDate firstDate = LocalDate.of(yyyy, mm, dd);
	
	System.out.println("Please enter second date mm dd yyyy: ");
	int mm2 = scanner.nextInt();
	int dd2 = scanner.nextInt();
	int yyyy2 = scanner.nextInt();
	
	LocalDate secondDate = LocalDate.of(yyyy2, mm2, dd2);
	
	Period diff = Period.between(firstDate, secondDate);
	System.out.println("Dates differ by " + diff.getYears()+ " Years" + diff.getMonths() + " Months" + diff.getDays() + " Days");
	scanner.close();

	}

}

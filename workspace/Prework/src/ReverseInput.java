import java.util.Scanner;

public class ReverseInput {
 
	 public static void main(String args[])
	   {
	      int number, reverse = 0;
	 
	      System.out.println("Enter numeric value: ");
	      Scanner value = new Scanner(System.in);
	      number = value.nextInt();
	 
	      while( number != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + number%10;
	          number = number/10;
	      }
	 
	      System.out.println("Reverse value is "+ reverse);
	   }
	}


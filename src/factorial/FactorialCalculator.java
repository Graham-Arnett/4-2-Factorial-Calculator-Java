package factorial;
import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Factorial Calculator");
		
		String choice;
		
		do 
		{
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			int entry = scanner.nextInt();
			if(entry < 0 || entry > 10) 
			{
				System.out.println("Invalid, please enter a valid number between 0 and 10.");
			}
			else 
			{
				long factorial = 1;
				for (int i = 1; i <= entry; i++) //i = 1 initializes it, less than or equal makes sure it goes for entry times, and i++ makes it increment the loop
				{
					factorial *= i;
				}
				System.out.println("The factorial of " + entry + " is " + factorial + "!" );
			}
			System.out.print("Would you like to go again? (y/n): ");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}

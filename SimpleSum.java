
import java.util.Scanner;


public class SimpleSum
{
	public static void main(String[] args) 
	{
	    //Standard intro of progam
		System.out.println("This program will print out the sum of all numbers ");
		System.out.println("Up to the number you have Entered. ");
		System.out.println("For Example: If you enter 4, the out put would be 10");
		System.out.println("Because 1 + 2 + 3 + 4 = 10");
		
		System.out.println("*********************************************************");
		System.out.println("");
		
		//Create Scanner object and varibles that I will be using
		Scanner keyboard = new Scanner(System.in);
		
		int number1;
		int numberTotal = 0;
		
		String input;
		char repeat;
		
		//Decided to use do loop because we just learned it in class and I thought it was cool
		do
		{
		    System.out.println("Please enter a number: ");
		    number1 = keyboard.nextInt();
		    
		    //Input validation
		    if(number1 < 0 || number1 == 0)
		    {
		        while(number1 < 0 || number1 == 0)
		        {
		            System.out.println("Please enter a number that is greater than 0");
		            number1 = keyboard.nextInt();
		        }
		    }
		    
		    //For whatever reason, I cannot get variable input that I call later using
		    //keyboard.nextLine() without error if I dont have this after keyboard.nextInt()
		    //figuring this out took hours!!!!!
		    
		    keyboard.nextLine();
		    
		    System.out.println("");
		    
		    System.out.println("You have entered: " + number1);
		    
		    System.out.println("");
		    
		    System.out.println("Adding...");
		    
		    //For loop to count
		    for(int i = 1; i <= number1; i++)
		    {
		        System.out.print(numberTotal + " + " + i + " = ");
		        numberTotal = numberTotal + i;
		        System.out.println(numberTotal);
		    }
		    
		    System.out.println("*************************************************");
		    
		    //Print result
		    System.out.println("The sum of all numbers up to " + number1 + " is " + numberTotal);
		    
		    System.out.println("Would you like to find the sum");
		    System.out.println("of another number? ");
		    
		    System.out.println("");
		    
		    //Ask user if they would like to run the code again
		    System.out.println("Please enter Y for yes and N for no: ");
		    input = keyboard.nextLine();
		    repeat = input.charAt(0);
		    System.out.println("");
		    
		    numberTotal = 0;
		    
		}
		while(repeat == 'y' || repeat == 'Y');
	}
}

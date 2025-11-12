// Harshita Girdhar 
// 11-7-25
// This program gets a number from 1-1000 from the user 
// Working on: Using while, do while loops and if-else statments

import java.util.Scanner;

public class HailStone
{
	private int input; // FV for user input 
	private int count; // FV for the number of the times the loop runs 
	
	public HailStone() // default constructor
	{
		input = 0;
		count = 0;
	}
	
	/*
	 * Creats instance of the class, and uses it to call the method find it 
	 */
	public static void main (String [] args) 
	{
		HailStone hs = new HailStone();
		hs.findIt();
	}
	
	/*
	 * Find it calls the method getInput(), printSequence(), printCount()
	 * using a do while loop. It also sets the restrictions for user input
	 * and sets a counter for the number of times the loop runs
	 * 
	*/
	public void findIt()
	{
		System.out.println("\n\n\n");
		System.out.println("Welcome to Hailstone!!");
		System.out.println();
		System.out.println("This program displays the Hailstone Sequence"
			+ " proposed by German mathematician Lothar Collatz.");
		System.out.println();
		 do
		 {
			getInput();
			if(input >= 1 && input <= 10000)
			printSequence();
			printCount();
			count = 0;
		} while(input != -1);		
	}
	
	/*
	 * Prompts welcome statment and collects user input 
	*/
	public void getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer (1 - 10000). To quit " +
			" enter -1: ");
		input = sc.nextInt();
	}
	
	/*
	 * Uses a do while loop to generate and print out the hailstone sequence 
	 * for a number. It repeats until the number becomes 1 and also counts 
	 * the number of times the loop runs 
	*/
	public void printSequence()
	{
		do
		{	
			System.out.printf("%7d", input);
			if(input % 2 == 0)
			{
				input = input/2;
			}
			else 
			{
				input = input*3 + 1;
			}
			count++;
			if(count % 10 == 0)
				System.out.println();
		} while(input != 1);
		
		System.out.printf("%7s", "1");
	}
		/*
		 * Prints a message based on the user's input
		 * Shows how many steps the sequence took if input == 1 
		 * Displays a goodbye message if input == -1
		 * Tells user if the input was out of range
		 * Also prints out resutls of Hailstone using if-else statements 
		 */
		public void printCount()
		{
			if(input == 1)
				System.out.printf("\nThe loop executed %d times.", count + 1);
				
			else if(input == -1)
			{
				System.out.println();
				System.out.println("\nThank you for playing Hailstone!\n\n\n");
			}
			else 
			{
				System.out.println();
				System.out.println("Enter a value within range, please!");
			}
			System.out.println("\n");
		}
	
		
	}

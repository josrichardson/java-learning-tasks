/* 
	The purpose of this task is to demonstrate how to create loops and print them on the screen.

	@author: 	Jordan S. Richardson
	@version: 	1.0 - June 19, 2017
 */

//Start of Scanenr class
import java.util.Scanner;

//Start of main class
public class Task24{

	//Start of main method - starting point of application
	public static void main(String[] args){

		//This line of code prints the text to the screen
		System.out.println("Enter your name:");

		//Creates an instance of the Scanner class
		Scanner scanner = new Scanner(System.in);

		//Allows the user to input text
		String input;

		//Allows the input to start on a new line, and for it to be scanned
		input = scanner.nextLine();

		//Starts loop
		for(int counter = 0; counter < 4; counter++){

			//This line prints out the input on to the screen
			System.out.println(input);

		}//End of loop	

	}//End of main method

}//End of class
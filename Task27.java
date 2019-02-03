/* 
    The purpose of this task is to demonstrate how to solve simple equations by allowing the user to input their own data, and then print the solution on the screen.

    @author:    Jordan S. Richardson
    @version:   1.0 - June 21, 2017
 */

//Start of Scanenr class
import java.util.Scanner;

//Start of main class
public class Task27{

    //Start of main method - starting point of application
    public static void main(String[] args){

        //Creates an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);

        //This line of code shows the variables, and identifies that they are integers
        int a;
        int b;
        int sum;
        
        //This line of code prints the text to the screen
        System.out.println("Enter the first number:");
        //This line of code shows that the variable will correspond with the integer given
        a = scanner.nextInt();

        //This line of code prints the text to the screen
        System.out.println("Enter the second number:");
        //This line of code shows that the variable will correspond with the integer given
        b = scanner.nextInt();
        
        //This line of code shows the equation that needs to be solved
        sum = a * b;

        //Creates an output expression
        String output;
        //Gives the term 'output' meaning
        output = String.format("The sum of %d + %d is %d.", a, b, sum);

        //This line prints out the output on to the screen
        System.out.println(output);  

    }//End of main method

}//End of class
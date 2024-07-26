//Here we will get information from a user then display that information

//import the ability to Scan for user input
import java.util.Scanner;

public class SampleScanner{
  public static void main(String[] args){

    //create a new Scanner object named stdIn (standard input)
    //assign it it listen to System.in
    Scanner stdIn = new Scanner(System.in);
    
    //Prompt user to type their name
    System.out.println("What is your name?");

    //assign whatever the user types next to the variable 'name'
    String name = stdIn.next();

    //prove that we've read the user's input
    System.out.println("Hello, " + name);

    //turn off our Scanner
    stdIn.close();

}

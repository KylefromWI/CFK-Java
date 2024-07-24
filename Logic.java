import java.util.Scanner;

//An example program to showcase the basics of logic
public class Logic{

  public static void main(String[] args){
    //declaring variables

    Scanner stdIn = new Scanner(System.in);

    boolean isFancy;
    boolean canDrive;

    //first ask the user if they are fancy
    //note: The user must answer either 'true' or 'false'
    System.out.println("Are ya fancy?");
    isFancy = stdIn.nextBoolean();
    
    //next ask the user if they can drive
    System.out.println("Are ya fancy?");
    isFancy = stdIn.nextBoolean();

    if(isFancy){
      System.out.println("You probably like tea");
    }

    if(canDrive){
      System.out.println("That's cool. Driving is useful. ");
    }

    //example of using AND for when both booleans are true
    if(isFancy&canDrive){
      System.out.println("You might like to drive a Rolls Royce");
    }

    //example of the 'not' operator
    if(!isFancy){
      System.out.println("Burgers are great. No shame");
    }
    
  }
}

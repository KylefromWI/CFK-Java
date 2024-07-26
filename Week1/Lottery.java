//Day 5

//New concepts:
  //String comparison
  //do Loop
  //Math functions (specifically random numbers)


import java.util.Scanner;


public class Lottery
{

  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    String input;
    int winningNumber = //TODO add the winning number. First hard-code a number. We will randomize it soon


    System.out.println("Want to win a million dollars?");
    System.out.println("If so, guess the winning number (a" +
      " number between 1 and " + Integer.MAX_VALUE + ")."); //Interger.MAX_VAALUE is a constant that represents the biggest value an interger can be
    do
    {
      System.out.print(
        "Enter your guess or 'q' to quit: ");
      input = stdIn.nextLine();
      
      //Cheating Backdoor
        // below (in line 33) we want to check if the input equals the String "give me a hint"
        // New concept: String equality
        // to check if two Strings are equal then we use a method that looks like...
            // <firstString>.equals(<secondString)
      
      if (???)    //  a back door if user enters "give me a hint"
      {
            System.out.println("try: " + winningNumber);
          }
          else if (!input.equals("q")) //here we make sure the user hasn't asked to quit
          {
            if ( //TODO compare the input with the winning number
            {
              System.out.println("YOU WIN!");
              input = "q"; // force winners to quit
            }
            else
            {
              System.out.println(
                "Sorry, good guess, but not quite right.");
            }
          } // end else if
        } while (!input.equals("q"));
          System.out.println("Thanks for playing. Come again!");
      } // end main
    } // end Lottery class

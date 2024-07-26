//This program runs a register for a digital lemonade stand

import java.util.Scanner;

public class LemonadeStandComplete{ //you can rename this if you want, just be sure to rename the file also

  public static void main(String[] args){

  //------------
  //  Variables
  //------------
  //Create your Scanner object like in past programs

  Scanner stdIn = new Scanner(System.in);
    
  //create two double type variables
  //One to store the number of lemonades the user wants to buy
  //One to store the number of cookies the user wants to buy

  double numCookies, numLemonades;
    
  //create a variable called totalCost that will eventually store the customer's final cost

  double totalCost;
    
  //---------
  //  Prices
  //---------

    //Set two prices. one for lemonade and one for cookies.
    // lemonades should cost $0.50 per cup
    // cookies should cost $1.00 per cookie
    //hint: what ~type~ of data should these variables be?

    double priceCookie = 1.0;
    double priceLemonade = 0.5;

  //---------
  // Control 
  //---------

    System.out.println("******************************************");
    System.out.println("  WELCOME TO THE DIGITAL LEMONADE STAND!!");
    System.out.println("******************************************");
    
    //Ask the user how many lemonades they want, then ask how many cookies they want. 
    //Store those two values to the appropriate variables
  
    System.out.println("How many lemonade do you want?");
    numLemonades = stdIn.nextDouble();

    System.out.println("How many cookies do you want?");
    numCookies = stdIn.nextDouble();
    
  //-------
  // Math
  //-------

    //Calculate the total cost of the user's purchase and store it to the totalCost variable
    totalCost = numLemonades*priceLemonade + numCookies*priceCookies;

  //---------
  // Result
  //---------

    //print the total cost of the user's purchase

    System.out.println("******************************");

    //your output should be formatted like: "Your total comes out to $2.50"
    System.out.println("Your total comes out to $" + totalCost);
    System.out.println("******************************");

  //  Challenge: Sales tax
  //   Oh no!! Due to the Digital Lemonade Stand generating so much revenue...
  //   The IRS has demanded we charge a sales tax of 7%
  //   Change the above code so that this tax is added to the user's total cost
    
  }
  
}

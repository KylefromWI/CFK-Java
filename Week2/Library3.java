//Here is text you'll find useful 

//sorcerersStone, chamberOfSecrets, prisonerOfAzkaban, gobletOfFire, orderOfThePhoenix, halfbloodPrince, deathlyHallows

//"Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets", "Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
//"Harry Potter and the Order of the Phoenix", "Harry Potter and the Halfblood Prince", "Harry Potter and the Deathly Hallows"

import java.util.Scanner;

public class Library3{

  public static void main(String[] args){
    
    Scanner stdIn = new Scanner(System.in);

    String input; //stores the choices the user makes
    
    //TODO create an array of strings for the titles of the books
    //TODO create an array of booleans to keep track of which books are checked out
    public String[] bookTitles = {"Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets", "Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
"Harry Potter and the Order of the Phoenix", "Harry Potter and the Halfblood Prince", "Harry Potter and the Deathly Hallows"};

    public boolean[] areCheckedOut = new boolean[7];

    areCheckedOut[1] = true;
    
    System.out.println("\n");
    System.out.println("The books you have checked out are: ");
    
    for(int i = 0; i < areCheckedOut.length; i++){
      if(areCheckedOut[i]){
        System.out.print(bookTitles[i] + ", ");
      }
    } //end for 

    System.out.print("and that's it!");
    System.out.println("\n \n");
    
    
    //prettyPrintHeader("WELCOME TO THE DIGITAL HARRY POTTER LIBRARY");

    //TODO body of the library will go here

    
    stdIn.close();
  } //end main method
  
//Method that prints the input string in a pretty way
/*  public void prettyPrintHeader(String title)
  {
    System.out.println("\n");
    System.out.println("*************************************************");
    System.out.println("  " + title + "  ");
    System.out.println("*************************************************");
    System.out.println("\n");
  } //end prettyPrintHeader
*/
  
//listCheckedOut: lists the books the user has checked out
  public void listCheckedOut(String[] checkedOutTitles, boolean[] areCheckedOut)
  {

    System.out.println("\n");
    System.out.println("The books you have checked out are: ");
    
    for(int i = 0; i < checkedOutBooks.length; i++){
      if(areCheckedOut[i]){
        System.out.print(checkedOutTitles[i] + ", ");
      }
    } //end for 

    System.out.print("and that's it!");
    System.out.println("\n \n");
    
  } //end listCheckedOut

  
} //end Library3

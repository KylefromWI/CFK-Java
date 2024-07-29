//Here is text you'll find useful 

//sorcerersStone, chamberOfSecrets, prisonerOfAzkaban, gobletOfFire, orderOfThePhoenix, halfbloodPrince, deathlyHallows

//"Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets", "Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
//"Harry Potter and the Order of the Phoenix", "Harry Potter and the Halfblood Prince", "Harry Potter and the Deathly Hallows"

import java.util.Scanner;

public class Library3{

  public static void main(String[] args){
    
    Scanner stdIn = new Scanner(System.in);

    String input; //stores the choices the user makes

    String[] bookTitles = {"Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets", "Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
"Harry Potter and the Order of the Phoenix", "Harry Potter and the Halfblood Prince", "Harry Potter and the Deathly Hallows"};

    boolean[] areCheckedOut = new boolean[7];

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

    
    stdIn.close();
  } //end main method

  
} //end Library3

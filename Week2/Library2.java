//Cleaned up version without adding any new concepts

import java.util.Scanner;

public class Library{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	boolean sorcerersStone, chamberOfSecrets, prisonerOfAzkaban, gobletOfFire, orderOfThePhoenix, halfbloodPrice, deathlyHallows;

  //Print the header  
	System.out.println("\n \n \n");
	System.out.println("*************************************************");
    System.out.println("  WELCOME TO THE DIGITAL Harry Potter Library!!	 ");
    System.out.println("*************************************************");
	System.out.println("\n");

  //Ask user which books they'd like to check out
  System.out.println("Give the answer 'true' or 'false' for each question");

	System.out.print("Would you like to check out Harry Potter and the Sorcerers Stone?");
	sorcerersStone = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Chamber of Secrets?");
	chamberOfSecrets = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Prisoner of Azkaban?");
	prisonerOfAzkaban = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Goblet of Fire?");
	gobletOfFire = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Order of the Phoenix?");
	orderOfThePhoenix = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Half-Blood Prince?");
	halfbloodPrince = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Deathly Hallows?");
	deathlyHallows = stdIn.nextBoolean();
	stdIn.close();

    
		System.out.println("\n");

  //Print out which books the user has checked out
	System.out.println("You checked out books: ");
	if(sorcerersStone) {
			System.out.print("Harry Potter and the Sorcerers Stone, ");
		}
	if(chamberOfSecrets) {
			System.out.print("Harry Potter and the Chamber of Secrets, ");
		}
	if(prisonerOfAzkaban) {
			System.out.print("Harry Potter and the Prisoner of Azkaban, ");
		}
	if(gobletOfFire) {
			System.out.print("Harry Potter and the Goblet of Fire, ");
		}
	if(orderOfThePhoenix) {
			System.out.print("Harry Potter and the Order of the Phoenix, ");
		}
	if(halfbloodPrince) {
			System.out.print("Harry Potter and the Half-Blood Prince, ");
		}
	if(deathlyHallows) {
			System.out.print("Harry Potter and the Deathly Hallows, ");
		}
	System.out.print("and that's it!");
	System.out.println("\n \n");

  //Print the closing header  
	System.out.println("********************************************************");
	System.out.println("Thank you for visiting the Digital Harry Potter Library!");
	System.out.println("********************************************************");
	}
}

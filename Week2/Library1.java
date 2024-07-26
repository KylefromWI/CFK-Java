import java.util.Scanner;

public class Library{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	boolean sorcerersStone;
	boolean chamberOfSecrets;
	boolean prisonerOfAzkaban;
	boolean gobletOfFire;
	boolean orderOfThePhoenix;
	boolean halfbloodPrince;
	boolean deathlyHallows;
	System.out.println("\n \n \n");
	System.out.println("*************************************************");
    System.out.println("  WELCOME TO THE DIGITAL Harry Potter Library!!	 ");
    System.out.println("*************************************************");
	System.out.println("\n");
	System.out.print("Would you like to check out Harry Potter and the Sorcerers Stone? Give answer 'true' or 'false'");
	sorcerersStone = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Chamber of Secrets? Give answer 'true' or 'false'");
	chamberOfSecrets = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Prisoner of Azkaban? Give answer 'true' or 'false'");
	prisonerOfAzkaban = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Goblet of Fire? Give answer 'true' or 'false'");
	gobletOfFire = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Order of the Phoenix? Give answer 'true' or 'false'");
	orderOfThePhoenix = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Half-Blood Prince? Give answer 'true' or 'false'");
	halfbloodPrince = stdIn.nextBoolean();
	System.out.print("Would you like to check out Harry Potter and the Deathly Hallows? Give answer 'true' or 'false'");
	deathlyHallows = stdIn.nextBoolean();
	stdIn.close();
		System.out.println("\n");
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
	System.out.println("********************************************************");
	System.out.println("Thank you for visiting the Digital Harry Potter Library!");
	System.out.println("********************************************************");
	}
}

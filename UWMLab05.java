//This is the fifth lab from UWM's intro to coding course
// It is a good example of if/then statements

public class UWMLab05
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
//
System.out.println("CS 201 Restaurant Guide\n");
String response;
char s, f;
boolean spicy, fancy;
// Ask user for his/her preference
System.out.print("Do you like spicy food? (y / n) : ");
// Get the next token
response = stdIn.next();
// Look only at first character
s = response.charAt(0);
if ( s == ’y’ || s == ’Y’ )
spicy = true;
else
spicy = false;
// Ask user for his/her preference
System.out.print("Do you want to go to a fancy restaurant? (y / n) : ");
// Get the next token
response = stdIn.next();

// Look only at first character
f = response.charAt(0);
fancy = (f == ’y’) || (f == ’Y’);
// Make suggestion
if ( spicy && fancy )
System.out.println("I suggest you go to Thai Garden Palace.");
else if ( !spicy && !fancy )
System.out.println("I suggest you go to Joe’s Diner.");
else if ( spicy && !fancy )
System.out.println("I suggest you go to Alberto’s Tacqueria.");
else if ( !spicy && fancy )
System.out.println("I suggest you go to Chez Paris.");
stdIn.close();
}
}

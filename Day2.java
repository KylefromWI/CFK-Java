//On day 2 we learned about comments (like this, they start with two '/'s

/* if you want a multi-line comment then it
  looks
  like this */

public class Day2{

  //
  //STRINGS: ESCAPE SEQUENCES AND CONCATENATION
  //
  
  //escape sequences allow you to print things that would be difficult otherwise
  System.out.println("Kyle says, \" programming is fun!\");

  /* 
    Other escape sequences include...
    \n for newline
    \t for tab

    and '\' is printed by doing \\

  */
  System.out.println("you can\nprint\nmore than \nline\in the same println");

  //String concatenation (uses the '+' symbol). Example is when a kid says 1 + 1 = 11
  System.out.println("When you concatenate strings " + "dont forget to add spaces");
  System.out.println("Otherwise" + "all" + "your" + "words" + "run" +"together");

//
//VARIABLES
//

//Primitive types are built-in to java

/*
  The primitive types we'll use most are int, double, char, and boolean
  not: they all start with lowercase letters

  int: integer (whole number) 
       often used for ages, maximum values, lengths of things that are countable
       can take the values between -2,147,483,648 and 2,147,483,647
       
  double: use for parts of numbers (e.g. halves) and numbers that might be bigger than 2 billion

  boolean: a truth value. is either 'true' or 'false'
        often look like isHappy, isEven, canDance

  char: character. e.g. letters, digits, punctuation, spaces
        to symbolize this they must be surrounded by single quotes
*/

char firstLetter = 'A';

//Naming Variables

/*
  ALWAYS name your variables something useful. Remember, code needs to be readable

  Compare:

  String date = "Mason";
    vs
  String nameOfUser = "Mason";

  The second one gives much more information to whoever is working on the code

  camelCase: in java most programmers start variable names with lowercase letters,
            then every word in the variable name after that starts uppercase
  Finally: variables cannot be keywords. For instance, you can't name a variable 'int'
*/

}

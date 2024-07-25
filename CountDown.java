
public class CountDown{
  public static void main(String[] args){

    int currentCount = 5;

    //a while loop will keep repeating itself until it's condition becomes 'false'
    
    /* syntax:
        while(<condition>){
          lines of code you want to repeat
        }
    */
    
    while(currentCount > 0){
      //print the current number
      System.out.println(currentCount);

      //decrease the current number by one
      currentCount = currentCount - 1;
    }
    
    //print a fun final message
    //(the true purpose of this line is to show the user that the loop is over)
    System.out.println("Blast Off!!);
  }
}

import java.util.Scanner;
/**
 *This program sorts the users numbers in acsending order
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates new Scanner
    Scanner input = new Scanner(System.in);

    //asks and allows user to input first interger
    System.out.println("Please enter an integer:");
    int firstInt = input.nextInt();

    //Asks and allows user to input second integer
    System.out.println("Please enter another integer:");
    int secondInt = input.nextInt();

    //Sorts users numbers accordingly
    if(firstInt >= secondInt){
      System.out.println("Your numbers in ascending order are " + secondInt + ", " + firstInt);
    } else {
      System.out.println("Your numbers in ascending order are " + firstInt + ", " + secondInt);
    }
    
  }
}

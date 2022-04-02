import java.util.*;


/**
 * Program to calculate students' grades in a course
 * @author Chris Brown
 */
public class GradeCalculator {


   /**
   * Prints the letter grade based on percentage
   * @param percent grade
   */
   public static String getLetterGrade(int percent) {
     String message = "";
     if (percent >= 90) {
       message += "You got an A!";
     }
     if (percent >= 80) {
       message += "You got a B!";
     }
     if (percent >= 70) {
       message += "You got a C!";
     }
     if (percent >= 60) {
       message += "You got a D!";
     }
     else {
       message += "You got an F!";
     }
     return message;
   }


   /**
   * Starts the program
   * @param args arguments passed into main method
   */
   public static void main (String[] args) {
     Scanner console = new Scanner(System.in);
     System.out.print("Enter your grade: ");
     int grade = console.nextInt();
     System.out.println(getLetterGrade(grade));
   }
}

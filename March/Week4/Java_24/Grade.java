import java.util.Scanner;

public class Grade {
   
   public static String findGrade(int score) {
      // check score is within 0-100 or not
      
      
     
      switch(score/10) {
       
        case 10:
        case 9:
         
       
        case 8:
           return "A";
       
        default:
           return "B";
      }
   }

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
     
      System.out.print("Enter score value: ");
      int score = scan.nextInt();
      
     
      System.out.println("Grade = " + findGrade(score));
      
     
      scan.close();
   }

}
import java.util.Scanner;

public class Input
{
  public static void main(String args[])
  {
     int num;
     float fnum;
     String str;
     double dbl;
 
     Scanner in = new Scanner(System.in);
 
     
     System.out.println("Enter a string: ");
     str = in.nextLine();
     System.out.println("Input String is: "+str);
 
    
     System.out.println("Enter an integer: ");
     num = in.nextInt();
     System.out.println("Input Integer is: "+num);
 
 
     System.out.println("Enter a float number: ");
     fnum = in.nextFloat();
     System.out.println("Input Float number is: "+fnum); 
   
     System.out.println("Enter a double number: ");
     dbl = in.nextDouble();
     System.out.println("Input double number is: "+dbl); 
  }
}
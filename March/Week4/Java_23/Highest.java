public class Highest {
    public static void main(String args[]) {
     int a=10;
     int b =20;
     int c=30;
     if(a>b && a>c){
         System.out.println("Highest number is " + a);
     }
     else if(b>a && b>c){
         System.out.println("Highest number is " +b);
     }
     else{
         System.out.println("Highest number is " + c);
     }
}
}
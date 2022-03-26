import java.util.Scanner;

public class Array
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array elements");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    
}
public class booleanM {
  
    public static boolean isEven(int mynumber)
    {
        return (mynumber % 2 == 0);
    }

    public static void main(String[] args)
    {
        int mynumber = 130;
        if(isEven(mynumber) == true)
            System.out.print("True");
        else
            System.out.print("False");
    }
}
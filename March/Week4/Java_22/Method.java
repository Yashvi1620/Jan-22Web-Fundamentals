public class Method {
    public static void main(String args[]) {
     Method obj=new Method();
     System.out.println("The sum is" + obj.Ans(10,20));
     System.out.println("The Difference is" + obj.Ans(20.5,10.8));
}
public int Ans(int a,int b){
    return(a+b);
}
public double Ans(double c,double d){
    return(c-d);
}
}
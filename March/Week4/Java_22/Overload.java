public class Overload{
        public static void main(String args[]){
        Overload Obj=new Overload();
        System.out.println("Volume of square is " + Obj.Volume(10));
         System.out.println("Volume of Rectangle is " + Obj.Volume(10,5,3));
           }
        public int Volume(int side){
           return(side*side*side);
        }
        public int Volume(int l,int b,int h){
           return(l*b*h);
        }
}
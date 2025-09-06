package basics;

public class Datatype{
    public static void main(String[] args){
        // first we understand the primitve data type
        //or predefined data type like int , float doubble and many more
        //declaration
        // ye sb stack  me hai abhi memory allocate nhi hui hai
        // java me memory allocation at run time hota hai
        //yuki java ek dynamic programing hai
        int x;//integer value
        float y;//decimal value
        double m;//for more decimals
        char ch;//store charector
        long l;//for large integer
        boolean b;//true or false

        // intialization
        x=5;
        y=5.978F;
        m = 10.12345;
        ch = 'A';
        l = 123456789L;
        b = true;
// printing all the values of variables
        // in print ln this ln means new line
        System.out.println("Integer x: " + x);
        System.out.println("Float y: " + y);
        System.out.println("Double m: " + m);
        System.out.println("Character ch: " + ch);
        System.out.println("Long l: " + l);
        System.out.println("Boolean b: " + b);

    }
}
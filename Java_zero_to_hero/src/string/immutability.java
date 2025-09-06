package string;

public class immutability {
    public static void main(String[] args) {
        String s="Hello";
        s.concat(" world");
        System.out.println(s);
        s=s.concat( " World");
        System.out.println(s);
        //concat doesnot change the string ;
        // to update we must assign the result back
    }
}

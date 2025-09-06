package string;

public class concat {
    public static void main(String[] args) {
        //concat() only works with Strings (not with integers, etc.).


        String a = "Java 346343";
        String b = " Rocks";
        String c=" jfvbniueuv";
        String result = a.concat(" ").concat(b).concat(c);
        System.out.println(a.concat(b).concat(c));
        System.out.println(result); // Output: Java Rocks
    }
}

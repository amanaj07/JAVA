package string;

public class equalsIgnorecase {
    public static void main(String[] args) {
        String a="Hello hehe";
        String b="hello HEHE";
        System.out.println(a.equals(b));
        //this ignore case means it ignore the uppercase or lowercase

        System.out.println(a.equalsIgnoreCase(b));
    }
}

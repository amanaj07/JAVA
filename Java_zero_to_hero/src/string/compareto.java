package string;

public class compareto {
    public static void main(String[] args) {
        // compare to meanse to compare the strings chareceter or elemnt by lexicographically (kkon bada kon kb ata hai b ada hota hai a se)
        String a ="caaaaaaaaaaa";
        String b="AAAAAA";
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(b));
        System.out.println(b.compareToIgnoreCase(a));
    }
}

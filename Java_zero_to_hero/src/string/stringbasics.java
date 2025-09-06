package string;

public class stringbasics {
    public static void main(String[] args) {
//string is a class in java.lang package
    String name="aman" ;
    String name2=new String("kese ho ");
    String name4 =new String("kese ho ");
        System.out.println(name);
        System.out.println(name2);
        // strings are immutable
        String name3="aman";
        System.out.println(name==name3);
        //this check every thing even the spce between the charecter
        System.out.println(name2==name4);
        //this will not even check the nnew strings

        System.out.println(name2.equals(name4));

    }

}

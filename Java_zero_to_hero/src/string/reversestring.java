package string;

public class reversestring {
    public static void main(String[] args) {
        String s="ABCDFEG";
        StringBuilder s1=new StringBuilder(s.length());
        for(int i=s.length()-1;i>=0;i--){
            s1.append(s.charAt(i));
        }
        System.out.println(s1);
        // we can reverse a string by swapin its charecctor


    }



}

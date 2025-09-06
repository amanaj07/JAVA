package recursion;

public class skipchar {
    public static void skip(String s,String ans) {

        if(s.charAt(0)=='a'||s==""){

            return;
        }
        ans=ans+s.charAt(0);
        System.out.print(ans);
        skip(s.substring(1),ans);

    }
    public static void main(String[] args) {
        String s="nbooanuujab";
        String ans="";
        System.out.println(s+"   first");
        skip(s,ans);
        System.out.println(ans+"  nbo");

    }
}

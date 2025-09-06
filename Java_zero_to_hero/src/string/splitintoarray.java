package string;

public class splitintoarray {
    public static void main(String[] args) {
        String mylocation="lucknow,mumbai,chenni,heydrabd,kese ho,age koi sher nhi hai";
        String mylocationlist[]=mylocation.split(",");
        for(int i=0;i<mylocationlist.length;i++){
            System.out.println(mylocationlist[i]+" ");
        }
        String s1="kdfcnuabv@gmail.com";
        String s2="kdfcnhsdbcwebvuabv@hotmail.com";
        String[] sarry =s1.split("@");

            String m=sarry[1];
        System.out.println(m.substring(0,5));

    }
}

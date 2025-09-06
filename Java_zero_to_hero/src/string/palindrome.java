package string;

public class palindrome {

    public static boolean palin(String s,int i,int j){
        if(i==j){
            return true;
        }
        return s.charAt(i)==s.charAt(j)&&palin(s,i+1,j-1);
    }
    public static void main(String[] args) {
        int i=0;String s="na>man";
        int j=s.length()-1;
        boolean ans=palin(s,i,j);
        System.out.println(ans);

    }
}

package striverRecursion;

public class SumToN {
    static int ans=0;
    public static void sum(int n) {

        if(n<1){
            return;
        }
        sum(n-1);
        ans=ans+n;

        System.out.println(ans);
    }
    public static void main(String[] args) {
        sum(5);
    }
}

package striverRecursion;

public class SumToNinParameter {
    public static int sum(int n){
        if(n==0){
           return 0;
       }
        n=n+sum(n-1);
       return n;
    }
    public static void main(String[] args) {
        int ans =sum(6);
        System.out.println(ans);
    }
}

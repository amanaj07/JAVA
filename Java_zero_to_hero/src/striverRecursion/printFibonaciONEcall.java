package striverRecursion;

public class printFibonaciONEcall {
        static int start =0;
        static int secoond=1;
    public static void fibo(int n){
        if(n==2){
            return;
        }
        fibo(n-1);
        System.out.println(start+secoond);
        int ans=start+secoond;
        start=secoond;
        secoond=ans;
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);

        fibo(8);

    }
}

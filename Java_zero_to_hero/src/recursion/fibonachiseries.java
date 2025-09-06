package recursion;

public class fibonachiseries {
    public static int fibo(int n) {
        int x=0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        x=fibo(n - 1)+ fibo(n - 2);

   return x; }

    public static void main(String[] args) {
       int n= fibo(5);
        System.out.println(n);

    }
}


package striverRecursion;
public class FibonacciRecursion {
    // Recursive function to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // multiple recursive calls
    }

    public static void main(String[] args) {
        int n = 8;

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

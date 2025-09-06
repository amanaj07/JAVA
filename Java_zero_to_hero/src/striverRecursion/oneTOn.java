package striverRecursion;

public class oneTOn {
    public static void print1ton(int n){
        if(n<1){

            return;
        }

        print1ton(n-1);
        System.out.println(n);
        // this is backtraking
        // if we print the n before the funtion call the this is not backtaking

    }
    public static void main(String[] args) {
        print1ton(6);
    }
}

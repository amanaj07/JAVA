package recursion;

public class firstprg {
    public static void recursion(int count){
        System.out.print(count+" ");
        if(count==5){
            return;
        }


        recursion(count+1);
        System.out.print(count+" ");
    }

    public static int factorial(int n) {
        int x=0;
        if(n==0||n==1){

            return 1;
        }
       x=n*factorial(n-1);
        return x; }
    public static void main(String[] args) {
        //recursion repetetion of a task
        recursion(1);
        int m=0;
       m=factorial(5);
        System.out.println(m);
    }
}

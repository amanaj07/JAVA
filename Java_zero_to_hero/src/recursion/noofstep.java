package recursion;

public class noofstep {
    public static int count=0;
    public static int steps(int n) {
        if(n==0){
            return count;
        }
        if(n%2==0){
            count=count+1;
            steps(n/2);

        }
        else{
            count=count+1;
            steps(n-1);

        }




    return count;}
    public static void main(String[] args) {
        int n=9;
        int ans=steps(n);
        System.out.println(ans);
    }
}

package recursion;

public class sumofdigitofnumber {
    public static void sumdigit(int num,int sum) {
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum= num%10+sum;
        sumdigit(num/10,sum);
    }
    public static void main(String[] args) {
        int n=432075;
        int sum=1;
        sumdigit(n,sum);
    }
}

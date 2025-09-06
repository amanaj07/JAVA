package conditionalandloop;

import java.util.Scanner;


public class ifelseif {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m>n){
            if(m==n){
                System.out.println("m and n is equals");
            }
            else{
                System.out.println("m is greater then n");
            }


        }
        else{
            System.out.println("mis lesser then n");
        }

    }
}

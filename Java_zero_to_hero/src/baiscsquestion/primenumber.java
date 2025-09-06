package baiscsquestion;

import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            int m=n;
            if((m%i)==0){
               count++;
               break;
            }

        }
        if(count==0){
            System.out.println("number is prime number :" + n);
        }
        else{
            System.out.println("number is not prime number :"+n);
        }
    }
}

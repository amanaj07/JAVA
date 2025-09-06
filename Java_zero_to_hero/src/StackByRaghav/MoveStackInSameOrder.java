package StackByRaghav;

import java.util.Stack;
import java.util.Scanner;
public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int n;
        System.out.println("enter the number of elemnt");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=0;
        System.out.println("now enter the item in stack");
        while(i<n){
            s1.push(sc.nextInt());
            i++;
        }
        System.out.println(s1);
        while(s1.size()>0){
            s2.push(s1.pop());
        }
        System.out.println(s2);
        while(s2.size()>0){
            s3.push(s2.pop());
        }
        System.out.println(s3);

    }
}

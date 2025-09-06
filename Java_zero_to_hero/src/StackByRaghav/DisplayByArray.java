package StackByRaghav;

import java.util.Scanner;
import java.util.Stack;

public class DisplayByArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        Stack<Integer> st=new Stack<>();
        while(st.size()<n){
            st.push(sc.nextInt());
        }
        System.out.println(st);
        int[] arr=new int[n];
        int i=st.size();
        while(st.size()>0){
            arr[i-1]=st.pop();
            i--;

        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}

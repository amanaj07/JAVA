package StackByRaghav;

import java.util.ArrayList;
import java.util.Stack;

public class InCollectionFramework {
    public static void main(String[] args) {
        //ArrayList<Integer> list=new ArrayList<>();
        //jese hum arraylist ko impliment krte hai wese hi
        // stack ko bhi impliment kr skte java collecction frame work ki help se

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(2);
        st.push(46);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.peek()+ " "+ st.size());

    }
}

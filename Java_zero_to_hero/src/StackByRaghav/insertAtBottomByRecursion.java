package StackByRaghav;

import java.util.Stack;

public class insertAtBottomByRecursion {
    static void insert(Stack<Integer> st,int data){
        if(st.size()==0){
            st.push(data);
            return;
        }
        int top=st.peek();
        st.pop();
        insert(st,data);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        insert(st,10);
        System.out.println(st);
    }
}

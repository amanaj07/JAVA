package StackByRaghav;
import java.util.Stack;
public class RecursiveDisply {
    static void display(Stack<Integer> st){

        if(st.size()==0){
            return;
        }
        int top=st.peek();
        //System.out.print(st.pop()+" ");
        st.pop();
        display(st);

        System.out.print(" "+st.push(top));
        // ye sala error deta hao kuch to gadbad hai daya
        //System.out.print(st.pop()+" ");
    }
    static void ReverseDisplay(Stack<Integer>st){
        //iski jarurat hi nhi padoi  raghav ne dusa bata diya hai
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
        display(st);
        //now the stacck is empty
        //System.out.println(st);

    }
}

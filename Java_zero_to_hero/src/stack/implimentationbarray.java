package stack;

public class implimentationbarray {
    int stack[];
    int top;
    int size;
    public implimentationbarray(int stacksize){
        stack=new int [stacksize];
        size=stacksize;
        top=-1;
    }//now make function like push pop and more
    public void push(int element){
        if(top>=size){
            return;
        }
        else{
            top=top+1;
            stack[top]=element;
        }
    }
    public boolean isEmpty(){
        return top<=-1;
    }
    public int size(){
        return top+1;
    }
    public int peak(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }else{
            return stack[top];
        }
    }
    public  int pop() {
        //we can also do pop by using peak fun in this fun
        //int val= peak();
        //if(val!=Integer.MIN.VALUE){
        //top--;
        //}
        //return val;
        //}


        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            int ans=stack[top];
            top=top-1;
            return ans;
        }
    }
    public void pprintstack(){
        for(int i=0;i<top;i++){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        int n=5;
        implimentationbarray stack=new implimentationbarray(n);
        System.out.println("isempty"+stack.isEmpty());
        stack.push(9);
        stack.pprintstack();
        stack.push(6);
        stack.pprintstack();
        stack.push(8);
        stack.pprintstack();
        stack.push(67);
        stack.pprintstack();
        stack.push(3);
        stack.pprintstack();
        stack.push(4);
        stack.pprintstack();
        stack.pop();
        stack.pprintstack();
        stack.pop();
        stack.pprintstack();
        System.out.println("size"+stack.size());
        System.out.println("isempty"+stack.isEmpty());
        stack.pop();
        stack.pprintstack();
        stack.pop();
        stack.pprintstack();
        stack.pop();
        stack.pprintstack();
        System.out.println("peak is"+stack.peak());




    }

}

package StackByRaghav;
class Node{
    int data;
    Node next;
    Node(int  x){
        this.data=x;
    }
}
class LlImplimentation{
    Node head=null;
    Node top=head;
    void push(int data){
        Node temp=new Node(data);
        if(head==null){
           top=temp;
           head=top;
        }
        else {
            top.next=temp;
            top=temp;
        }


    }
    int pop(){
        if(head.next==null){
            int x=head.data;
            head=null;
            return x;
        }
        else if(head==null){
            System.out.println("stack is underflow");
            return -1;

        }
        else{

            int x = top.data;
            Node t = head;
            while (t.next != top) {
                t = t.next;
            }
            t.next = null;
            top = t;
            return x;
        }
    }
    void display(){
        Node d=head;
        while(d!=null){
            System.out.println(d.data);
            d=d.next;
        }
    }
}
public class LinkedListImplimentationOfStack {
    public static void main(String[] args) {
        LlImplimentation stack=new LlImplimentation();
        stack.push(34);
        stack.push(323);
        stack.push(3423);
        stack.push(322);
        stack.display();
        System.out.println("before pop");
        stack.pop();
        System.out.println("the removed one is "+stack.pop());
        stack.push(47);
        stack.display();

    }
}

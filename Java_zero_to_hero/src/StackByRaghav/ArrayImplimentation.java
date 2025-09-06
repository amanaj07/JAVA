package StackByRaghav;

import java.util.Scanner;
class Stack{
    int [] s;
    int capacity;
    int top;
    int peek =top;
    Stack(int capacity){
        s=new int[capacity];
        this.capacity=capacity;
        top=capacity;
    }
    void push(int data){
        if(top>0){
            top--;
            s[top]=data;
        }
        else {
            System.out.println("Stack is overflow");
        }
    }
    int pop(){

        if(top<capacity){
            int x=s[top];
            s[top]=0;
            top++;
            return x;
        }
        else{
            System.out.println("stack is underflow");
            return -1;
        }
    }
    void display(){
        System.out.print("[");
        for(int i=top;i<capacity;i++){
            System.out.print(s[i]+" ");
        }
        System.out.print("]");
    }
}
public class ArrayImplimentation {

    public static void main(String[] args) {
        Stack s=new Stack(5);

        s.pop();
        System.out.println(s.pop());
        s.push(26);
        s.push(32);
        s.display();




    }
}

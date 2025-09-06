package QueueByRaghav;


import java.util.Queue;

public class ArrayImplimentationOfQueue {
   static class Queue{
        int[] arr=new int[10];
        int front;
        int rear;
        Queue(){
            this.front=-1;
            this.rear=-1;
        }
        void add(int n){
            int i=rear;
            if(front==-1){
                arr[i+1]=n;
                front++;
                rear++;
            }
           else  if(rear<arr.length){
                arr[i+1]=n;
                rear++;
            }
           else{
                System.out.println("queue is full");
            }
        }
        int remove(){
            if(front==-1){
                System.out.println("queue is empty");
                return -1;
            }
            else if(front==arr.length-1){
                int temp=arr[front];
                return temp;
            }
            else{
                int temp=arr[front];
                front=front+1;
                return temp;
            }
        }
        void display(){
            if(front==-1){
                System.out.println("queue is empty");
                return;
            }
            else{
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }

        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.add(6);
        q.add(5);
        q.remove();
        q.remove();
        q.remove();
        q.display();
    }
}

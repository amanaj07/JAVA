package QueueByRaghav;



public class LinkedListImplimentation {
    static class Node{
        int data;
        Node next;
        Node(int n ){
           this.data =n;
        }
    }
    static class Queue{
        Node front=null;
        Node rear=null;
        void add(int n){
            Node temp=new Node(n);
            if(front==null){
             temp.data=n;
             front=temp;
             rear=temp;
            }
            else{
                temp.data=n;
                rear.next=temp;
                rear=temp;
            }
        }
        int remove(){
            if(front==null){
                System.out.println("empty  queue");
                return -1;
            }
            else if (front ==rear) {
                int temp=front.data;
                front=null;
                return temp;
            }
            else {
                int ans=front.data;
                Node temp=front;
                temp.next=front.next;

                front=temp;
                return ans;
            }
        }
        void display(){
            if(front==null){
                System.out.println("queue is empty");
            }
            else{
                Node temp=front;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(33);
        q.display();
        q.remove();
        q.remove();q.display();

    }
}

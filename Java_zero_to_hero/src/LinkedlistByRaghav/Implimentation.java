package LinkedlistByRaghav;

public class Implimentation {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            this.data=x;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void insetAtend(int data){
            Node temp=new Node(data);
            if(head==null){
                 head=temp;

            }
            else{
                tail.next=temp;

            }
            tail=temp;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count ++;
                temp=temp.next;
            }
       return count;
        }
        void insertAtBegging(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        void InsertNode(int index,int data){
            int i=0;
            Node temp=head;
            Node insert=new Node(data);
            if(index==0){
                insert.next=temp;
                head=insert;
                return;
            }
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            insert.next=temp.next;
            temp.next=insert;
        }
        void getELement(int index){
            Node temp=head;
           for(int i=0;i!=index;i++){
               temp=temp.next;
           }
            System.out.println(temp.data);
        }
        void deletAt(int index){
            Node temp=head;
            int i=0;
            if(index==0){
                head=temp.next;
                temp=null;
               return;
            }
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insetAtend(5);
        ll.insetAtend(23);
        ll.insetAtend(234);
        //ll.display();
       // System.out.println(ll.size());
        ll.insetAtend(2432);
       // System.out.println(ll.size());
        ll.insertAtBegging(4);
        ll.insertAtBegging(2);
        //ll.display();
        ll.InsertNode(0,10);
        //System.out.println("after that node");

        ll.InsertNode(6,45);

        ll.InsertNode(8,455);
        //ll.getELement(6);
        ll.display();
        System.out.println("");
        ll.deletAt(0);
        ll.display();
    }//  humne ksis me tail kko update nhi kiya hai tail bhi update hoga delete add hone ke bad

}

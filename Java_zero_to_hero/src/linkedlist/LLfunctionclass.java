package linkedlist;

public class LLfunctionclass {
    // in eveery linked list we have one head and one tail;

    private Node head;
    private Node tail;
    //yaha hummne ek node head nam ka or ek node tail nam
    // ka declare kiya hai

    private int size;

    // now make counstructer for the LL function class

    public LLfunctionclass(){
        this.size=0;
    }

    public void insertfirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;

    }

    // for inseert at the last index
    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    //this function is for adding at any index
    public void insertanyindex(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    // for diplay the linked list

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
        System.out.print(" END");
    }
    private class Node{
        //ye ke private classs hai jisme ki hume vlue denge us node ko
        //or batayenge ki wo node kisko age point krega


        private int value;
        //we dont want ki koi or inhe acces kre
        //issliye humne isko privvate kr diya hai
        private Node next;

        // now we are making a constructure when only  value is pass to the object
        public Node(int value){
            this.value=value;
        }
        // now we are making a constructure when we givve   value  and as well as the
        //where the node is to be pointing
        public Node(int value,Node next){
            this.value=value;
            this.next=next;

        }

    }
}

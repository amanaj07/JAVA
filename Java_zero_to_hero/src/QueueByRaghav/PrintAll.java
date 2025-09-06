package QueueByRaghav;

import arraysdatatype.Insertarray;

import java.util.LinkedList;
import java.util.Queue;
public class PrintAll {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        print(q);



    }
    static int i=0;
    public static void print(Queue<Integer> q){
        if(q.size()==0){
            return;
        }
        System.out.print(q.element()+" ");
        q.remove();
        print( q);
    }

}

package striverRecursion;

import java.util.ArrayList;

public class PrintSubsequence {
    static ArrayList<Integer>  list=new ArrayList<>();
    static void  sequence(int []arr,int index){
        int k=5;
        int sum=0;
        if(index==arr.length){

            return;
        }
        list.add(arr[index]);
        sequence(arr,index+1);
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        if(sum==k){
            System.out.println(list);

        }
        list.removeLast();

        sequence(arr,index+1);


    }
    public static void main(String[] args) {
        int [] arr={1,2,3};

        int i=0;
        sequence(arr,i);

    }
}//an extra for loop and if codtion is for printing the sequence whose sum is k

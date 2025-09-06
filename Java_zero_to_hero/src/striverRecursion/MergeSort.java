package striverRecursion;

import java.util.ArrayList;

public class MergeSort {

    static void devide(int [] arr,int start, int end){
        int mid=(start+end)/2;
        if(start>=end){
            return;
        }
        devide(arr,start,mid);
        devide(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    static void merge(int []arr,int start ,int mid,int end){

    }
    public static void main(String[] args) {

    }
}

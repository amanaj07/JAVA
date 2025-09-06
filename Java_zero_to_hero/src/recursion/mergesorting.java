package recursion;

import java.util.ArrayList;

public class mergesorting {
    public static void merge(int[] arr,int start,int mid, int end) {
       int s1=mid-start+1;
       int s2=end-mid;
       int[] left=new int [s1];
       int [] right=new int [s2];
       for(int i=0;i<s1;i++){
           left[i]=arr[start+i];
       }
       for(int j=0;j<s2;j++){
           right[j]=arr[mid+1+j];
       }
       int i=0,j=0,k=start;

       while(i<s1 &&j< s2){
           if(left[i]<=right[j]){
               arr[k++] = left[i++];
           }
           else{
               arr[k++]=right[j++];
           }
       }
        while (i < s1) {
            arr[k++] = left[i++];
        }

        while (j < s2) {
            arr[k++] = right[j++];
        }
    }
    public static void msort(int [] arr,int start,int end) {
        int mid=start+(end-start)/2;
        if(start>=end){

            return;
        }

        else{
            msort(arr,start,mid);
            msort(arr,mid+1,end);
            merge(arr,start,mid,end);

        }

    }
    public static void main(String[] args) {
        int arr[]={54,2,1,55,74,4,3,2,1};
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+"  ");
        }
        int start=0,end=arr.length-1;
        msort(arr,start,end);
        System.out.println("");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+"  ");
        }
    }
}

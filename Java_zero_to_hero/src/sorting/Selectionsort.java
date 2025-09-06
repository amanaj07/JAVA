package sorting;

import java.util.Scanner;
public class Selectionsort {
    //Selects the minimum element from unsorted part and places it at the beginning.
    public static void main(String[] args) {
        //inserting an array
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int  size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("enter the elemnt of arry");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int temp=0;
        // now we have to sort the array
        for (int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[i]){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int j : arr) {
            System.out.println(j);
        }
        // my code is more likeliy bubble sort but
        // the real selection sort is find the miminmum elemnt and the swap it

    }
}

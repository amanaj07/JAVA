package searching;

import java.util.Scanner;
class Binarysearchandswap {
    public static void swap(int i,int j,int[] ans){
        int temp=0;
        temp=ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
    }
    //for binarry search array should be sorted
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter target");
        int target=sc.nextInt();
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int [] arr= new int[size];
        int start=0;
        int last=size-1;
        System.out.println("enter array elemnts");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //now we are doing binnary search
        int mid;
        while(start<last){
            mid= start+(last-start)/2;
            if(arr[mid]==target){
                System.out.println("the target is found at index :"+ mid);
                break;
            }
            if(arr[mid]<target){
                start=mid;
            }
           else{
                last=mid;
            }

        }

       /* System.out.println("now find the ye to reverse array ho gaya hai ");
        while(start<last){
            swap(start,last,arr);
            start++;
            last--;

        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

    }
}

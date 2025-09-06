package recursion;

public class reversearray {
    public static void reverse(int [] arr,int i,int j) {
        if(i>j){
        return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        reverse(arr,start,end);
        for(int i=0;i<=arr.length-1;i++) {
            System.out.println(arr[i]);
        }
    }
}
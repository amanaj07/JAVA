package striverRecursion;

public class reverseArray {
    static void reverse(int[] arr,int i,int j){
        if (i>=j){
            return;
        }
        reverse(arr,i+1,j-1);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,53,345,2354,2,2,4,3,4};

        reverse(arr,0,arr.length-1);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.print(" ]");
    }
}

package striverRecursion;

public class QuicSort {
    static void swap(int[]arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void FindPiviot(int []arr,int start,int end){
        if(start>=end)return;
        int piviot=start;
        int i=start+1;
        int j=end;
        while(i<=j){
            if(arr[i]>arr[piviot]){
                if(arr[j]<=arr[piviot]){
                    swap(arr,i,j);
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }else{
                i++;
            }
        }

            swap(arr,piviot,j);



        FindPiviot(arr,start,j-1);
        FindPiviot(arr,j+1,end);



    }

    public static void main(String[] args) {
        int[]arr={5,3,6,2,7,8,1};
        FindPiviot(arr,0,arr.length-1);
        for(int i=0;i<7;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

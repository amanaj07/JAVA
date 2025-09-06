package sorting;
import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int temp=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //sbse bada sbse piche jayega inn single pass
        // now  doint insertion sort
        for (int i=1;i<size;i++){
            int m=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
                i--;

            }
            i=m;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}

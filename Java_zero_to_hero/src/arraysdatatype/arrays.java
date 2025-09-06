package arraysdatatype;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //arrays is a data structre us to store data in contigues manner
        int[] arr=new int[5];
        //we intialize a array of size 5
        arr[0]=10;
        arr[1]=0;
        arr[2]=90;
        arr[3]=80;
        arr[4]=50;
        //we use loop
        // for printing the array
        int i=0;

        int size=arr.length;//this fun use to get the length of arry
        while(i<size){
            System.out.println(arr[i]);
            i++;
        }
        // in java we have to decide the size of array first
        int j=0;
        System.out.println("sorted array is");
        Arrays.sort(arr);
        while(j<arr.length){
            System.out.println(arr[j]);
            j++;
        }


    }
}

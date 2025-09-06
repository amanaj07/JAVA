package recursion;

public class bubblesort {
    //int first pass the biggest elemnt at the end of th arrat
    public static void bublesort(int []arr,int i) {
for(int j=0;j<arr.length;j++) {
    if (i == arr.length) {
        return;
    }
    if (arr[i] < arr[i - 1]) {
        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;

    }
    i++;
    bublesort(arr, i);
}

    }
    public static void main(String[] args) {
        int arr[]={33,2,566,3,434,6,2};
        int i=1;
        bublesort(arr,i);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}

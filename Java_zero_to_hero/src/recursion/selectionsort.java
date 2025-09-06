package recursion;

public class selectionsort {
    public static void selection(int arr[], int minindex) {
        if (minindex >= arr.length - 1) {
            return;
        }

        int newminindex = minindex;
        for (int i = minindex + 1; i < arr.length; i++) {
            if (arr[i] < arr[newminindex]) {
                newminindex = i;
            }
        }

        // Swap if needed
        if (newminindex != minindex) {
            int temp = arr[newminindex];
            arr[newminindex] = arr[minindex];
            arr[minindex] = temp;
        }

        selection(arr, minindex + 1);
    }

    public static void main(String[] args) {
        int arr[] = {354, 2, 32432, 34, 343, 1, 9};

        System.out.println("Before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        selection(arr, 0);

        System.out.println("\nAfter sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

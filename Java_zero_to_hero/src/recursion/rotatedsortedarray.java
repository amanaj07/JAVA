package recursion;

public class rotatedsortedarray {

    public static int rotatedsearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // base case
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid; // found the target
        }

        // Check if the left half is sorted
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return rotatedsearch(arr, target, start, mid - 1);
            } else {
                return rotatedsearch(arr, target, mid + 1, end);
            }
        }
        // Right half is sorted
        else {
            if (target > arr[mid] && target <= arr[end]) {
                return rotatedsearch(arr, target, mid + 1, end);
            } else {
                return rotatedsearch(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        int target = 2;
        int ans = rotatedsearch(arr, target, 0, arr.length - 1);
        System.out.println("Index of target: " + ans); // Output should be 4
    }
}

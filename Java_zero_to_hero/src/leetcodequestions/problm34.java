package leetcodequestions;
import java.util.Scanner;

// Medium Question
// Find the first and the last position of the element in array
public class problm34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int[] ans = searchRange(arr, target);
        System.out.println("First and Last Positions: [" + ans[0] + ", " + ans[1] + "]");
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] answ = new int[2];
        answ[0] = firstOccurrence(arr, target);
        answ[1] = lastOccurrence(arr, target);
        return answ;
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) end = mid - 1;
            else start = mid + 1;

            if (arr[mid] == target) ans = mid;
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) start = mid + 1;
            else end = mid - 1;  // ✅ Fixed this line

            if (arr[mid] == target) ans = mid;
        }
        return ans;
    }
}

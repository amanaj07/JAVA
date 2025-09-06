package baiscsquestion;

import java.util.Scanner;
public class Secondlargestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 1; i < size; i++){
            if(arr[i] == largest) continue;
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.printf("%d", secondLargest);
    }
}

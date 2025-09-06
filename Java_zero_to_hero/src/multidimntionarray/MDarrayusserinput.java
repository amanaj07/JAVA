package multidimntionarray;

import java.util.Scanner;
public class MDarrayusserinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  no. of rows");
        int row= sc.nextInt();
        System.out.println("enter no. of columns");
        int col= sc.nextInt();
        int [] []arr=new int[row][col];
        System.out.println("insert array elemts");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(" print the array you enterd");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }


    }
}

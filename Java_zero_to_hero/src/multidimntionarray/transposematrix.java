package multidimntionarray;

import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no. of  row for matrix 1");
        int r1 = sc.nextInt();
        System.out.println("enter the  no. of col for matrix 2");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.println("now enter the elemnt of matrix 1");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // this swap logic is only applicable on square matrix \
        // but for non square matrix we have to use new array and copy the value into it
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){

                    temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;

            }
        }
        System.out.println("now printng the tansposed matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(  arr[i][j] + "  ");

            }
            System.out.println("");
        }
    }
}

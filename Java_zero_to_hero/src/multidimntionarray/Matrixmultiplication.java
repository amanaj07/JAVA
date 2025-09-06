package multidimntionarray;

import java.util.Scanner;
public class Matrixmultiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the no. of  row for matrix 1");
        int r1=sc.nextInt();
        System.out.println("enter the  no. of col for matrix 2");
        int c1= sc.nextInt();
        int[][] arr=new int[r1][c1];
        System.out.println("now enter the elemnt of matrix 1");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(" now take input for matrix 2");
        System.out.println("enter the no. of row for matrix 2");
        int r2=sc.nextInt();
        System.out.println("enter the  no. of col for matrix 2");
        int c2=sc.nextInt();
        int[][]arr2=new int[r2][c2];
        System.out.println("enter the element of m2");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing the m1 matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"   ");
            }
        }
        System.out.println("printing the m2 matrix");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+"   ");
            }
        }
        System.out.println("now we have to multiply these both matrix arr and arr2");
        if(c1!=r2){
            System.out.println("the multiplication is  not posible ");
            return;
        }
        int [][]ans=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]=ans[i][j]+arr[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j] +" ");
            }
            System.out.println("");
        }

    }
}

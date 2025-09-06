package searching;

import  java.util.Scanner;
class linearsearching {
    //linnear aearching
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter target");
        int target=sc.nextInt();
        System.out.println("enter size");
        int size=sc.nextInt();
        int[]arr=new int[size];
        int i=0;
        System.out.println("enter array");
        while(i<size){
             arr [i] = sc.nextInt();
            i++;
        }
        int j=0;
        System.out.println("wait for findingt");
        while(j<size){
            if(target==arr[j]){
                System.out.println("target is foundat index "+ j);
                break;
            }
            else{ //System.out.println("target not found");
                j++;
        }
    }
}
}

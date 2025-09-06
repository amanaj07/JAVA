package recursion;

public class arraysortedornot {

    public static boolean sorted(int []arr,int index) {
        if(index==arr.length-1){

            return true;
        }

   return arr[index]<arr[index+1]&&sorted(arr,index+1);}
    public static void main(String[] args) {
        int[] arr={1,2,3,4,34,6,7};
        int i=0;
       boolean ans= sorted(arr,i);
       if(ans){
           System.out.println("sorted");
       }


    }
}

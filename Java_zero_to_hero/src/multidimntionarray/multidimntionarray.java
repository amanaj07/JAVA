package multidimntionarray;

public class multidimntionarray {
    public static void main(String[] args) {
        //declaration of matrix
        //int [][] array=new int[3][3];
        //intialization of matrix
        //array[0][0]=2;// by this we can set each elemnt
        int[][]array={
                {4,5,2,6,8},
                {55,353,3,45,65},
                {34443,1,3,46,7,}
        };
       //give the length of an aray
        System.out.println(array[0].length);
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.println(array[i][j]);
            }
        }

    }
}

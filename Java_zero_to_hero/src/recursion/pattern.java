package recursion;

public class pattern {
    public static void printpatern(int row,int col) {
        if(col==row){
            col=0;
            System.out.println("");
            row=row-1;
        }
        if(row==0){

            return ;
        }

        System.out.print("* ");
        printpatern(row,col+1);
    }
    //* * * *
    //* * *
    //* *
    //*
    public static void main(String[] args) {
        int row=5;
        int col=0;
        printpatern(row,col);
    }
}

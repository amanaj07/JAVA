package striverRecursion;

public class checkPalindrome {
    static int i=0;
    static int j=8-1;
    static int count=0;
    static void check (String str){
        if(i>=j){
            return;
        }
        if(str.charAt(i)==str.charAt(j)){
            count++;

        }
        i++;
        j--;
        check(str);
    }
    public static void main(String[] args) {
        String str="ujebbeju";
        check(str);
        if(count>=(str.length()-1)/2){
            System.out.println("is palindroem");
        }
    }
}

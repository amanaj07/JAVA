package recursion;

public class permutation {
    static int start=0;
    static void printpermutation(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<up.length();i++){
            char ch=up.charAt(i);
            String remaming=up.substring(0,i)+up.substring(i+1);
            printpermutation(remaming,p+ch);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        int i=0;
        int nottaken=0;
        String sb="";
        printpermutation(s,sb);

    }

}

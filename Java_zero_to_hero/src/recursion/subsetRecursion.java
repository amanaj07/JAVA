package recursion;

public class subsetRecursion {
    static void printsusbtring(String s,StringBuilder ans, int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        ans.append(s.charAt(i));
        printsusbtring(s,ans,i+1);

        ans.deleteCharAt(ans.length()-1);
        printsusbtring(s,ans,i+1);
    }
    public static void main(String[] args) {
        String s="abcdf";
        StringBuilder ans=new StringBuilder();
        int i=0;
        printsusbtring(s,ans,i);
    }
}

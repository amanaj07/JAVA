package string;

public class susbtringbyloop {
    public static void main(String[] args) {
        String s="abcd";

        for(int i=0;i<s.length();i++){
            String ans="";
            ans=ans+s.charAt(i);
            System.out.println(ans);
            for(int j=i+1;j<s.length();j++){


                ans=ans+s.charAt(j);
                System.out.println(ans);
            }

        }

    }
}

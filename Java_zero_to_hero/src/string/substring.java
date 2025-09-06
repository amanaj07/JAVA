package string;

public class substring {
    public static void main(String[] args) {
        String s= "Hel345lo World";
        //j jo indexx daloge wha se end tk sara including that index
        System.out.println(s.substring(3));
        // or isme jaha se jaha tk pr last wale index ka ahta dega wo nhi lega
        System.out.println(s.substring(3,6));
        //printing all substring
        String str="abc";
        int n=str.length();
        for(int j=0;j<=n;j++) {
            for (int i = j; i <= n; i++) {
                System.out.print(str.substring(j, i) + " ");
            }
        }

    }
}

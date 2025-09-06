package string;

public class split {
    public static void main(String[] args) {
        //split is use to when you need to break the string by space comma etc
        String sb="jhbuiesbe jsddb,cuisedbv jsdbcuiasdb";
        System.out.println(sb);
        String[] words=sb.split(",");
        for(String word:words){
            System.out.print(word);
        }
    }
}

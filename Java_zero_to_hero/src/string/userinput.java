package string;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String word=sc.next();//for input a word
        System.out.println("enter the line");
        String line=sc.nextLine();
        System.out.println(word);
        System.out.println("line is" +line);
    }
}

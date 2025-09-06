package string;
import java.util. *;
public class formating {
    public static void main(String[] args) {
        double s=76.33646437867;
        System.out.println(s);
        System.out.printf("num is %f",s);//ye apka string input leta hai
        System.out.printf("num is %.8f",s);//.8 mtlb mujh e8 decimal state chiye
        String name=String.format("number if%.9f address is ",s);
        System.out.println(name);
    }
}

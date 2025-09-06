package string;

import java.awt.*;

public class trim {
    public static void main(String[] args) {
        String s="      Hello Java";
        // it remove the leading spaces

        System.out.println("Before : ["+ s+ "]");
        System.out.println("After:["+s.trim()+"]");
    }
}

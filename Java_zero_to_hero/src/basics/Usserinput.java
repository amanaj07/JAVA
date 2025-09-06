package basics;

import java.util.Scanner;

public class Usserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String n = sc.next();           // Reads one word
        System.out.println("You entered: " + n);

        sc.nextLine(); // consume the leftover newline from previous next()
        // ye wali line nhi smhj me aii ki hua kkya hai


        System.out.print("Enter a full sentence: ");
        String m = sc.nextLine();       // Reads a full line
        System.out.println("You entered the sentence: " + m);

        // now take input for integer
        System.out.print("Enter a integer: ");
        int p = sc.nextInt();       // Reads a full line
        System.out.println("You entered the intger: " + p);


        sc.close();
    }
}

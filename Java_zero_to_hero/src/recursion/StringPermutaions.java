package recursion;

public class StringPermutaions {


        // Recursive function to print all permutations
        public static void printPermutations(String str, String result) {
            if (str.length() == 0) {
                System.out.println(result);
                return;
            }

            // Loop through the string and recursively call for the rest of the characters
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                printPermutations(remaining, result + currentChar);
            }
        }

        public static void main(String[] args) {
            String input = "abcf";
            System.out.println("All permutations of " + input + " are:");
            printPermutations(input, "");
        }
    }



package recursion;

public class palindromenumber {

    public static boolean checkpalindrome(String n, int i, int j) {
        // ✅ Base case: if pointers have met or crossed, it's a palindrome
        if (i >= j) {
            return true;
        }

        // ❌ Characters mismatch: not a palindrome
        if (n.charAt(i) != n.charAt(j)) {
            return false;
        }

        // ✅ Characters match: continue checking the rest
        return checkpalindrome(n, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int n = 1551;

        String s = String.valueOf(n);
        int i = 0;
        int j = s.length() - 1;

        boolean ans = checkpalindrome(s, i, j);
        System.out.println(ans);
    }

}

package practice05;
import java.util.Vector;

public class PalindromicSubstrings {

    static int countPalindromes(String s) {
        int n = s.length();
        Vector<String> palindromes = new Vector<>();

        for (int center = 0; center < n; center++) {

            // Odd length palindromes
            expand(s, center, center, palindromes);

            // Even length palindromes
            expand(s, center, center + 1, palindromes);
        }

        return palindromes.size();
    }

    static void expand(String s, int left, int right, Vector<String> palindromes) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            palindromes.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countPalindromes(s));
    }
}


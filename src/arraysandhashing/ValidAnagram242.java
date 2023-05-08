package src.arraysandhashing;

/**
 * Leetcode problem number 242.
 * Valid Anagram.
 */
public class ValidAnagram242 {
    public static boolean isAnagram(String one, String two) {
        if (one == null || two == null) return false;
        if (one.length() != two.length()) return false;
        int end = one.length() - 1;
        for (int start = 0; start < one.length(); start++) {
            if (one.charAt(start) != two.charAt(end)) {
                return false;
            }
            end--;
        }
        return false;
    }
}

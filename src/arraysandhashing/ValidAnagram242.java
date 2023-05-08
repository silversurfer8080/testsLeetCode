package src.arraysandhashing;

import java.util.Arrays;

/**
 * Leetcode problem number 242.
 * Valid Anagram.
 */
public class ValidAnagram242 {
    public static boolean isAnagram(String one, String two) {
        if (checkNullandSize(one, two)) return false;
        int end = one.length() - 1;
        for (int start = 0; start < one.length(); start++) {
            if (one.charAt(start) != two.charAt(end)) {
                return false;
            }
            end--;
        }
        return false;
    }

    public static boolean isAnagramUsingSorting(String one, String two) {
        if (checkNullandSize(one, two)) return false;

        char[] charOne = one.toCharArray();
        char [] charTwo = two.toCharArray();

        Arrays.sort(charOne);
        Arrays.sort(charTwo);

        return Arrays.equals(charOne,charTwo);
    }

    private static boolean checkNullandSize(String one, String two) {
        if (one == null || two == null) return true;
        if (one.length() != two.length()) return true;
        return false;
    }

    public static boolean isAnagramCounting(String one, String two){
        int CHARACTER_RANGE= 256;
        if (checkNullandSize(one, two)) return false;

        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < one.length(); i++) {
            count[one.charAt(i)]++;

            count[two.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
                if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }


}

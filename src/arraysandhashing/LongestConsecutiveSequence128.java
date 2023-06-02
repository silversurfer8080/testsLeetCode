package src.arraysandhashing;

import java.util.HashSet;

public class LongestConsecutiveSequence128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        int res = 1;

        for (int num : nums) set.add(num);
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}

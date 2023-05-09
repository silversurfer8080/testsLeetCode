package src.arraysandhashing;

import java.util.HashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i =0; i < nums.length; i++){
            if(map.get(target-nums[i]) != null){
                solution[0] = map.get(target-nums[i]);
                solution[1] = i;
                return solution;
            }
            map.put(nums[i], i );
        }
        return solution;
    }
}

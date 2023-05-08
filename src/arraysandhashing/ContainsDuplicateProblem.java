package src.arraysandhashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 *  Leetcode problem 217.
 *  Link: https://leetcode.com/problems/contains-duplicate/
 */

public class ContainsDuplicateProblem {
    public boolean solveWithHashMap(int[] nums) {
        /**
         * Runtime: 15ms, beats 43,7%
         * Memory: 55,8 MB, beats 82,11%
         */
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Boolean result = false;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            Integer value = map.get(nums[i]);
            if(value != null){
                return true;
            } else{
                map.put(nums[i], count++);
            }
        }
        return result;
    }

    public boolean solveWithHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length, 1.0f);
        for (Integer num : nums) {
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static boolean solveWithStream(int[] nums){
        Set<Integer> lista = new HashSet<>();
        int size = Arrays.stream(nums).mapToObj(Integer::new).filter(i -> lista.add(i)).collect(Collectors.toSet()).size();
        System.out.println("list size "+size);
        return  Integer.valueOf(nums.length).equals(size);
    }
}

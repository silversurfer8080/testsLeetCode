package src.main.java;
import src.arraysandhashing.ContainsDuplicateProblem;
import src.arraysandhashing.TwoSum1;
import src.arraysandhashing.ValidAnagram242;

public class Main {

    public static void main (String[] args){
        int[] nums = new int[]{1,2,3};
        int [] result = TwoSum1.twoSum(nums, 5);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

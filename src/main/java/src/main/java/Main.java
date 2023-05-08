package src.main.java;
import src.arraysandhashing.ContainsDuplicateProblem;

public class Main {

    public static void main (String[] args){
        int[] nums = new int[]{1,2,3,4,4,5,5,2};
        System.out.println(ContainsDuplicateProblem.solveWithStream(nums));
    }
}

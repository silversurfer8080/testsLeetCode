package src.arraysandhashing;

public class ProductOfArrayExceptSelf238 {

    public static int[] productArray(int[] nums){
        // Edge case
        if(nums.length == 1) return new int[]{0};

        int prefix[] = new int[nums.length];
        int sufix[] = new int[nums.length];
        int prod[] = new int[nums.length];

        int i, j;

        prefix[0] = 1;
        sufix[nums.length-1] = 1;

        for (i = 1; i < nums.length; i++) {
            prefix[i] = nums[i-1] * prefix[i-1]; // left[0] = num[0] * prefix[0] -> 2*1, left[1] = nums[1]*prefix[1] -> 2*0=0, 0 ->
        }

        for (j = nums.length-2; j >= 0; j--) {
            sufix[j] = nums[j+1] * sufix[j+1];
        }

        for (i = 0; i < nums.length; i++) {
            prod[i] = prefix[i]*sufix[i];
        }

        return prod;

    }


}

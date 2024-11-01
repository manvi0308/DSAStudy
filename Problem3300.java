import java.util.Arrays;

public class Problem3300 {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            // replace each num with sum of its digits
            int sumDigit = 0;
            int temp = nums[i];

            while (temp != 0) {
                sumDigit += temp%10;
                temp = temp/10;
            }
            nums[i] = sumDigit;
            minSum = Math.min(minSum, nums[i]);
        }

       // System.out.println(Arrays.toString(nums));
        return minSum;
    }

    public static void main(String[] args) {
        
        int[] nums = {999,19,199}; // 10
        Problem3300 p = new Problem3300();
        System.out.println(p.minElement(nums));
    }
}

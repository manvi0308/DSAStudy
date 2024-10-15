package SlidingWindow;

public class Problem209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0, right = 0;
        int currWindowSum = 0;
        for(right = 0; right < nums.length; right++){
            currWindowSum+=nums[right];

            while (currWindowSum >= target) {
                minLen = Math.min(right - left + 1, minLen);
                currWindowSum -= nums[left];
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE? 0 : minLen;
    }
}

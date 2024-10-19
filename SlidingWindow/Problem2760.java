package SlidingWindow;
public class Problem2760{
    public int longestAlternatingSubarray(int[] nums, int threshold){
        int left = 0;
        int right = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0 && nums[i] <= threshold){
                left = i;
                break;
            }
        }
        System.out.println("left is at " + left);
        right = left + 1;
        int maxLen = 1;
        
        while (right != nums.length) {
            if(nums[right - 1] % 2 != nums[right]% 2 && (nums[right] >= threshold && nums[right - 1] >= threshold)){
                maxLen = Math.min(right - left + 1, maxLen);
            }
            else{
                left++;
            }
        }
        

        return maxLen;
        /*
         * [2, 3, 5, 4] threhold = 4
         * 
         * left = 2
         * right = 3
         * 
         * 
         */
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4};
        Problem2760 p = new Problem2760();
        System.out.println(p.longestAlternatingSubarray(nums, 4));
    }
}
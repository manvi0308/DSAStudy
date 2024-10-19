package SlidingWindow;

import java.util.*;;

public class Problem219 {
    public boolean containNearbyDuplicate(int[] nums, int k) {
        /*
         * nums[i] == nums[j] and i - j <= k
         * 
         * Input: nums = [1,2,3,1,2,3], k = 2
         * 
         */

         HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
         for(int i = 0; i < nums.length; i++) {
             if(hMap.containsKey(nums[i]) &&
             Math.abs(hMap.get(nums[i]) - i) <= k)
                     return true;
             hMap.put(nums[i], i);
         
         }
         return false;
                    

    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        Problem219 p = new Problem219();
        System.out.println(p.containNearbyDuplicate(nums, 1)); // true

        int[] nums2 = { 1, 2, 3, 1, 2, 3 };
        System.out.println(p.containNearbyDuplicate(nums2, 2)); // false

        int[] nums3 = { 99, 99 };
         System.out.println(p.containNearbyDuplicate(nums3, 2)); // true
    }
}

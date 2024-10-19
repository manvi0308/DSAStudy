package SlidingWindow;

public class Problem643 {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        for(int i = 0; i <= nums.length - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += nums[j];
            }
            double cAvg = sum/(double)k;

            maxAverage = Math.max(maxAverage, cAvg);
        }
        return maxAverage;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        Problem643 p = new Problem643();
        System.out.println(p.findMaxAverage(nums, 4));

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(p.findMaxAverage(nums2, 2));
    }
}

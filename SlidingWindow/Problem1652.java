package SlidingWindow;

import java.util.Arrays;

public class Problem1652 {
    public int[] decrypt(int[] code, int k){
        int n = code.length;
        int[] res = new int[n];

        // Case 1
        if(k == 0){
            Arrays.fill(res, 0);
            return res;
        }
        else if(k > 0){
            // case 2
            /*
             * 5    7   1   4
             * k = 3
             * 
             * for arr[i] store the sum of arr[i + 1] to arr[i + k] in res[i]
             * arr[0]
             * arr[1],arr[2], arr[3]
             * 
             * 
             * arr[1]
             * arr[2],arr[3], arr[4]
             * 
             * 4 is out of bound, here comes the concept of circular array
             * n --> 0
             * n +  1 --> 1 
             * n + 2 --> 2
             * n + 3 --> 3
             * 
             * arr[2]
             * arr[3], arr[4], arr[5]
             * arr[3], arr[4 + 0], arr[4 + 1]
             * 4 - 4  = 0
             * 5 - 4 = 1
             * 
             */
            
            for(int i = 0; i < n; i++ ){
                // iterating over result
                for(int j = i + 1; j <= i + k; j++){
                    if(j >= n){
                        res[i] += code[j - n];
                    }
                    else{
                        res[i] += code[j];
                    }

                }
            }
        }
        else{
            /*
             * Case 3 k < 0, so previous k elements sum will be stored
             * Input: code = [2,4,9,3], k = -2
             * Output: res = [12, 5, 6, 13]
             * 
             *              
             * at index 1, prev k elements will be
             * at index 0, and -1
             * n - 1
             * 
             * at index 0, prev k elements will be 
             * i - 1 to i - k
             * 
             * 
             * 
             */
            
            for(int i = 0 ; i < n; i++){
                System.out.println("i loop");
                for(int j = i - 1; j > i - k; j--){
                    /*
                     * i    j
                     * 0    0 - (-2) = 2
                     *      1 ()
                     */
                    System.out.println("j loop");
                    if(j < 0){
                        j = (n  + j);
                        res[i] += code[j];
                    }
                    else{
                        res[i] += code[j];
                    }
                }
            }
            
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 1, 4};
        Problem1652 p = new Problem1652();
        int[] res = p.decrypt(nums, 3);
      //  System.out.println(Arrays.toString(res));

        int[] nums2 = {2, 4, 9, 3};
        int k = -2;
        int[] res2 = p.decrypt(nums2, k);
        System.out.println(Arrays.toString(res2));

    }
}

package GFG;
import java.util.*;;
public class TwoSumPairs {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        // get pairs with 0 sum
        // arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
        // Output: [[-6, 6],[-1, 1]]
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i= 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && set.contains(-arr[i])){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(-arr[i]);
                Collections.sort(temp);
                                res.add(temp);
                set.remove(arr[i]);
                set.remove(-arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
         System.out.println(getPairs(arr));

        int[] arr2 = {-1, 0, 1, 2, -1, -4};
        System.out.println(getPairs(arr2));


    }
}

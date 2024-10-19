package GFG;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        /*
         * Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
         */
        while (i != a.length && j != b.length) {
            set.add(a[i]);
            set.add(b[j]);
            i++;
            j++;
        }

        while (i != a.length) {
            set.add(a[i]);
            i++;
        }
        while (j != b.length) {
            set.add(b[j]);
            j++;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] a = {1,2, 3};
        int[] b = {1, 2, 3, 4, 5};

        System.out.println(findUnion(a, b));

        int a2[] = {85, 25, 1, 32, 54, 6};
        int []b2 = {85, 2};
        System.err.println(findUnion(a2, b2)); 

    }
}

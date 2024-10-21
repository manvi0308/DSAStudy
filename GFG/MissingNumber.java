public class MissingNumber{
    int missingNumber(int[] arr){
        int n = arr.length;
        // arr will be containing number from 1 to n + 1 except 1 number
        // return that missing number
        int sum = (n + 1)*(n + 2)/2;
        int currSum = 0;
        for(int i = 0; i < n; i++){
            currSum += arr[i];
        }

        return sum - currSum;

    }
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] arr = {1, 2, 3, 5};
        System.out.println(mn.missingNumber(arr)); // 4
    }
}
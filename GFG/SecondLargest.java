package GFG;

public class SecondLargest {
    public int getSecondLargest(int[] arr){
        // find the first maximum
        int firstMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            firstMax = Math.max(firstMax,arr[i]);
        }

        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondMax && arr[i] < firstMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        SecondLargest sl = new SecondLargest();
        System.out.println(sl.getSecondLargest(arr));
    }
}

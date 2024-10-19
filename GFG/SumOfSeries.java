package GFG;
public class SumOfSeries{
    public static long seriesSum(int n){
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(8));
    }
}
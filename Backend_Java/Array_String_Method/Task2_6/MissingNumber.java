package Task2_6;

public class MissingNumber {
    public int findMissingNumber(int[] arr, int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}

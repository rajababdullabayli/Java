package Task2_17;

public class FibonacciIterative {
    public int fibonacciIterative(int n) {
        int fbFirstNumb = 1;
        int fbSecondNumb = 0;
        int sum = 0;
        //1,1,2,3,5||,8,13,21,34,55,...

        for(int i=2;i<=n;i++){
            sum = fbFirstNumb+fbSecondNumb;
            fbSecondNumb = fbFirstNumb;
            fbFirstNumb = sum;
        }
        return sum;
    }
}

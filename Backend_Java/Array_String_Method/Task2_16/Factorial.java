package Task2_16;

public class Factorial {
    int factorial = 1;
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            factorial *= n*factorial(n-1);
        }
        return factorial;
    }
}

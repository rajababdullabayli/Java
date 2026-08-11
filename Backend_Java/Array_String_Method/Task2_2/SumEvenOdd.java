package Task2_2;

public class SumEvenOdd {

    public void sumEvenOdd(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        System.out.println("Even numbers sum: " + sumEven);
        System.out.println("Odd numbers sum: " + sumOdd);
    }
}

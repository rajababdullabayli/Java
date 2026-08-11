package Task2_1;

public class SecondLargest {
    public int secondLargest(int[] arr) {
        int first = 0;
        int second = 0;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return second;
    }
}

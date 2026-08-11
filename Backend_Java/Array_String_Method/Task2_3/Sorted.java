package Task2_3;

public class Sorted {
    public boolean isSorted(int[] arr) {
        int arrLength = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

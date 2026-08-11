package Task2_5;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] arr) {
        int uniqueCount = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueCount++;
            }
        }
        int[] arrRemoveDuplicates = new int[uniqueCount];
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arrRemoveDuplicates[k] = arr[i];
                k++;
            }
        }
        arrRemoveDuplicates[k] = arr[arr.length-1];
        return arrRemoveDuplicates;
    }
}

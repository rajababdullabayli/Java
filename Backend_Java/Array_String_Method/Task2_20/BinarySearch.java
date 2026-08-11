package Task2_20;

public class BinarySearch {
    public int binarySearch(int[] arr, int target){
        int index =0;
        for (int numb : arr){
            if (numb == target){
                return index;
            }
            index++;
        }
        return -1;
    }
}

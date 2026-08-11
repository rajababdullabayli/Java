package Task2_4;

public class MergeSorted {
    public int[] mergeSorted(int[] arr1, int[] arr2) {
        int[] arrNew = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        for (int k = 0; k < arrNew.length; k++) {
            if (j >= arr2.length || (i<arr1.length && arr1[i]<arr2[j])){
                arrNew[k] = arr1[i];
                i++;
            } else {
                arrNew[k] = arr2[j];
                j++;
            }
        }
        return arrNew;
    }
}

package Task2_22;

public class PairsWithSum {
    public int findPairsWithSum(int[] arr, int target){
        for (int numb1 : arr){
            for (int numb2 : arr){
                if (numb1 + numb2 == target){
                    System.out.println("Pairs: ("+numb1+","+numb2+")");
                }
            }
        }
        return target;
    }
}

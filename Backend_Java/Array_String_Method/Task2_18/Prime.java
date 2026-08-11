package Task2_18;

public class Prime {
    public boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(n)+1 ; i++) {// Math.sqrt(n)+1 yazdimki 9,10,11,...,15 olanda treu olur
            if(n==2||n==3){
                return true;
            }
            if (n % i == 0) {
                count++;
            }
        }
        if (count==0){
            return true;
        }
        else {
            return false;
        }
    }
}


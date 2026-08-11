package Task2_19;

public class GreatestCommonDivisor {
    public int gcd(int a, int b){
        /*
        48-18=30
        30-18=12
        18-12=6
        12-6=6
         */
        while (a!=b){
            if(a>b){
                a-=b;
            }else {
                b-=a;
            }
        }
        return a;
    }
}

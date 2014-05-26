package problems;

/**
 * Created by josep_000 on 5/17/2014.
 */
public class ThousandDigitFib {

    long[] memo;

    public static void main(String[] args) {
        ThousandDigitFib fib = new ThousandDigitFib();
        fib.memo = new long[10000];
        int i = 2;
        for(; String.valueOf(fib.fib(i)).length() < 1000; i++) {
        }
        System.out.println(i);
        System.out.println(fib.fib(i));
        //System.out.println(fib.fib(10));

    }

    private long fib(int n) {
        if(n <= 2) {
            return 1;
        } if(memo[n] != 0){
            return memo[n];
        }
        else {
            memo[n] = fib(n-1) + fib(n-2);
            System.out.println("fib " + n + " = " + memo[n]);
            return memo[n];
        }
    }
}

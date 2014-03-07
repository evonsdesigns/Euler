package problems;

/**
 * Created by josep_000 on 3/6/14.
 */
public class EvenFibonacciNumbers {

    public static void main(String[] args) {

        // brute force method
        int prev = 1;
        int fib = 1;
        int sum = 0;
        while(fib < 4000000) {
            int oldval = prev;
            prev = fib;
            fib = oldval + fib;
            if(fib % 2 == 0) {
                sum += fib;
            }
        }
        System.out.println(sum);


        // recursive
        int recursiveSum = sumFib(1, 1, 0);
        System.out.println(recursiveSum);
    }


    private static int sumFib(int prev, int prev2, int sum) {
        if(sum > 4000000) {
            return sum;
        }
        int fib = prev + prev2;
        if(fib % 2 == 0) {
            sum += fib;
        }
        return sumFib(fib, prev, sum);
    }
}


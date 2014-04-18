package spoj;

import java.util.Scanner;

public class PrimeGenerator {

    // Brute force to find prime numbers -- BAD!!
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfInputs  = Integer.parseInt(s.nextLine());
        for(int i = 0 ; i < numberOfInputs; i++) {
            String[] inputs = s.nextLine().split(" ");
            int lowerBound = Integer.parseInt(inputs[0]);
            int upperBound = Integer.parseInt(inputs[1]);

            for(int j = lowerBound; j <= upperBound; j++) {
                if(isPrime(j)) {
                    System.out.println(j);
                }
            }
            System.out.println();

        }
    }

    private static boolean isPrime(int j) {
        for(int k = 2; k < j; k++) {
            if(j % k == 0) {
                return false;
            }
        }
        return true;
    }
}

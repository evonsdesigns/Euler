package problems;

public class SumSquareDifference {

    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSums = 0;
        for(int i = 1; i <= 100; i++) {
            squareOfSums += i;
            sumOfSquares += Math.pow(i, 2);
        }
        squareOfSums = (int) Math.pow(squareOfSums, 2);
        System.out.println(squareOfSums);
        System.out.println(sumOfSquares);
        System.out.println(squareOfSums - sumOfSquares);
    }
}

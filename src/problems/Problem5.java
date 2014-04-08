package problems;

public class Problem5 {

    public static void main(String[] args) {
        int base = 2520;
        while (true) {
            if(isSmallestMultiple(base)) {
                System.out.println(base);
                break;
            } else {
                base++;
            }
        }
    }

    private static boolean isSmallestMultiple(int value) {
        for (int i = 20; i > 10; i--) {
            if (value % i != 0) {
                return false;
            }
        }
        return true;
    }
}

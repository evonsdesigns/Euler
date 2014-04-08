package problems;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        int largestPalindrome = -1;
        for(int a = 999; a >= 100; a--) {
            for(int b = a; b >= 100; b--) {
                if(isPalindrome(a, b) && (a*b)>largestPalindrome) {
                    largestPalindrome = a*b;
                }
            }
        }

        System.out.println(largestPalindrome);
    }


    private static boolean isPalindrome(int x, int y) {
        final String palindrome = String.valueOf(x*y);
        int begin = 0;
        int end = palindrome.length() - 1;

        while(begin < end) {
            if(palindrome.charAt(begin) != palindrome.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}

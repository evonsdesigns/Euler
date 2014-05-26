package strings;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by josep_000 on 5/26/2014.
 */
public class ReverseString {

    public static String reverse(String input) {
        char[] arr = input.toCharArray();
        String backwards = "";
        long start = System.nanoTime();
        for(int i = arr.length - 1;i >= 0; i--) {
            backwards += arr[i];
        }

        System.out.println("Reverse Runtime: " + (System.nanoTime() - start) + " ns");
        return backwards;


    }


    public static String reverseOptimized(String input) {
        char[] arr = input.toCharArray();

        long start = System.nanoTime();
        for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
            char c = arr[j];
            arr[j] = arr[i];
            arr[i] = c;
        }
        String backwards = new String(arr);
        System.out.println("Reverse Optimized Runtime: " + (System.nanoTime() - start) + " ns");
        return backwards;
    }
}

package strings;

/**
 * Created by josep_000 on 5/26/2014.
 */
public class ReverseString {

    public static String reverse(String input) {
        char[] arr = input.toCharArray();
        String backwards = "";
        for(int i = arr.length - 1;i >= 0; i--) {
            backwards += arr[i];
        }
        return backwards;
    }
}

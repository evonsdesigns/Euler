package strings;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josep_000 on 5/7/2014.
 * <p/>
 * Replace an occurrence of a string in-place
 */
public class ReplaceStringInPlace {

    public static void main(String[] args) {
        List<Pair<Character, Integer>> pairs = new ArrayList<>();
        pairs.add(new Pair<Character, Integer>('3', 2));

        String input = "hey you!";
        ReplaceStringInPlace p = new ReplaceStringInPlace();
        p.decodeSpaces(input);
    }

    private void decodeSpaces(String input) {
        char[] arr = resizeCharArray(input.toCharArray()) ;


        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == ' ') {

                for(int j = 3 ; i+j < arr.length; j++) {
                    arr[i+j] = arr[i+j-2];
                }
                arr[i] = '%';
                arr[i+1] = '2';
                arr[i+2] = '0';
            }
        }


        for(int i = 0; i <arr.length;i++) {
            System.out.print(arr[i]);
        }
    }

    // Potentially 3x the size of original array if all characters are spaces
    private char[] resizeCharArray(char[] arr) {
        char[] resized = new char[arr.length*3];

        for(int i = 0; i < arr.length; i++) {
            resized[i] = arr[i];
        }
        return resized;
    }

    private void encodeSpaces(String input) {
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '%') {
                if (i + 2 < arr.length
                        && arr[i+1] == '2'
                        && arr[i+2] == '0') {
                    arr[i] = ' ';
                    for(int j = 3; i + j < arr.length; j++) {
                        arr[i+j-2] = arr[i+j];
                        arr[i+j] = ' ';
                    }

                }
            }
        }

        for(int i = 0; i <arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}

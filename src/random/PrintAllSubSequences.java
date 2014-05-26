package random;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josep_000 on 5/8/2014.
 */
public class PrintAllSubSequences {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 2, 3, 4, 5, 6, 7, 9, 5, 3, 2 ,5, 9, 53, 1 ,3 ,5};
        PrintAllSubSequences p = new PrintAllSubSequences();
        p.printAllSubSequences(arr, 4, 16);

    }

    private void printAllSubSequences(int[] arr, int lower, int upper) {
        List<Pair<Integer, Integer>> pairs = new ArrayList<Pair<Integer, Integer>>();

        for(int i =0 ; i < arr.length; i++ ) {
            int sum = 0;
            int j = i;
            for(; j < arr.length; j++) {
                if(sum + arr[j] < upper) {
                    sum += arr[j];
                } else {
                    break;
                }
            }
            if(sum > lower) {
                pairs.add(new Pair<Integer, Integer>(i, j)); // element at J not part of sequence
                i = j - 1;
            }


        }

        for(Pair<Integer, Integer> pair : pairs) {
            System.out.println(pair.getKey() + " "  + pair.getValue());
        }

    }

}


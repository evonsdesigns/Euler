package strings;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josep_000 on 5/7/2014.
 */
public class Condense {


    public static void main(String[] args) {
        String input = "aaabbcdddddeeaaa";

        // Initial error handling
        if(input.length() == 0) {
            //return input;
        }

        List<Pair<Character, Integer>> counts = new ArrayList<>();
        int count = 1;
        char current = input.charAt(0);

        for(int i = 0; i < input.length(); i++) {
            // New character
            if(input.charAt(i) != current) {
                counts.add(new Pair<Character, Integer>(current, count));
                current = input.charAt(i);
                count = 1;
            }
            else {
                count++;
            }
        }
        // Need to store the last in the array
        counts.add(new Pair<Character, Integer>(current, count));

        StringBuilder s = new StringBuilder();
        for(Pair<Character, Integer> pair : counts) {
            s.append(pair.getKey());
            s.append(pair.getValue());
        }

        if(s.toString().length()>input.length()){
            System.out.println("Input is longer, no condensing");
        } else {
            System.out.println(s.toString());
        }

    }
}

package careercup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array of integers, sort the array into a wave like array, namely
 * a1 >= a2 <= a3 >= a4 <= a5
 */
public class Wave {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> variables = new ArrayList<Integer>();
        while (s.hasNext()) {
            String input = s.nextLine();
            if (input.equals("exit")) {
                break;
            } else {
                variables.add(Integer.parseInt(input));
            }
        }

        // all  variables are now in array
        Collections.sort(variables);

        int[] sorted = new int[variables.size()];
        for (int i = 0; i < sorted.length; i = i + 2) {
            try {
                sorted[i] = variables.get(i + 1);
                sorted[i + 1] = variables.get(i);
            } catch (IndexOutOfBoundsException ex) {
                sorted[i] = variables.get(i);
            }
        }

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }

        s.close();
    }

}
package careercup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * http://www.careercup.com/question?id=5653018213089280
 * 
 * runs in n^2 time
 */
public class SmallestSequence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> variables = new ArrayList<Integer>();
        int sum = Integer.parseInt(s.nextLine());
        while(s.hasNextLine()) {
            String input = s.nextLine();
            if(input.equals("exit")) {
                break;
            }
            else {
                variables.add(Integer.parseInt(input));
            }

        }
        /// all the variables are now in the array
        int counter = 0;
        int smallestSequence = Integer.MAX_VALUE;
        for(int i = 0; i <  variables.size(); i++) {
            counter = 1;
            int total = variables.get(i);
            if(total > sum) {
                smallestSequence = 1;
                break;
            }
            for(int j = i + 1; j < variables.size(); j++) {
                total += variables.get(j);
                counter++;
                if(total > sum) {
                    if(counter < smallestSequence) {
                        smallestSequence = counter;
                    }
                    break;
                }
                if(i == 0 && j == variables.size() - 1) {
                    smallestSequence = 0;
                }
            }

        }
        System.out.println(smallestSequence);
        s.close();
    }

}

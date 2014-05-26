package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by josep_000 on 4/18/14.
 */
public class PowerSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input set separated by spaces (ex: \"x y z\")");

        String[] inputs = s.nextLine().split(" ");

        List<String> powerset = new ArrayList<String>();

        for(int i = 0; i < inputs.length; i++) {

            // first item by itself
            powerset.add(inputs[i]);
            String set = inputs[i];
            for(int j = i + 1; j < inputs.length; j++)
            {
                set += " " + inputs[j];
                powerset.add(set);
            }

        }
        powerset.add("Ø");

        for (String s1 : powerset) {
            System.out.println(s1);
        }

    }
}

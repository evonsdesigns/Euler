package problems;

/**
 * Created by josep_000 on 3/6/14.
 */
public class MultiplesOf3Or5 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

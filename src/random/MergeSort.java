package random;

/**
 * Created by josep_000 on 5/6/2014.
 */
public class MergeSort {

    public static void main(String[] args) {

        System.out.println();
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(new int[]{3, 2, 7, 4, 1, 9, 8, 6});
        mergeSort.sort(new int[]{3});
        mergeSort.sort(new int[]{});
        mergeSort.sort(new int[]{3, 2, 7, 4, 1, 9, 14, 8, 6});
        mergeSort.sort(new int[]{3, 2, 7, 6, 4, 9, 9, 1, 9, 8, 6});
        mergeSort.sort(new int[]{3, 3, 3, 0});


    }

    private void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] output = split(arr);
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }

    private int[] split(int[] input) {
        if(input.length <= 1) {
            return input;
        }

        int middle = input.length/2;
        int[] left = new int[middle];
        int[] right = new int[input.length-middle];

        // store values to two arrays
        for(int i = 0; i < middle; i++) {
            left[i] = input[i];
        }
        for(int i = 0; i < input.length - middle; i++) {
            right[i] = input[i+middle];
        }

        return merge(split(left), split(right));

    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int leftptr = 0;
        int rightptr = 0;
        while(leftptr < left.length && rightptr < right.length) {
            if(left[leftptr] < right[rightptr]) {
                merged[leftptr + rightptr] = left[leftptr++];
            } else {
                merged[leftptr + rightptr] = right[rightptr++];
            }
        }
        while(leftptr < left.length) {
            merged[leftptr+rightptr] = left[leftptr++];
        }
        while(rightptr < right.length) {
            merged[leftptr+rightptr] = right[rightptr++];
        }
        return merged;
    }
}

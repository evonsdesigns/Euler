package random;

public class Quicksort {

    public static void main(String[] args) {
//            int[] arr = new int[] {4,2,7,16,1,8};

        int[] arr = new int[] { 4, 3, 6, 7, 0, 8 };
        Quicksort quicksort = new Quicksort();

        quicksort.quicksort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr2 = new int[] {4};
        quicksort.quicksort(arr2, 0, arr2.length - 1);
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int[] arr3 = new int[] {4, 4, 9, 1 , 3 ,2 , 5, 59, 68921, 385, 12, 9, 1, 0};
        quicksort.quicksort(arr3, 0, arr3.length - 1);

        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    private void quicksort(int[] arr, int p , int r) {
        if(r > p) {
            int j = partition(arr, p, r);
            quicksort(arr, p, j-1);
            quicksort(arr, j+1, r);
        }
    }

    private int partition(int[] arr, int p, int r) {
        int i = p;
        int j = r;
        int pivot = arr[p];
        while(i < j) {
            while(arr[i] <= pivot && i < j) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[p];
        arr[p] = arr[j];
        arr[j] = temp;
        return j;
    }
}

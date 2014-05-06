package random;

public class SimpleHeap {

    public static void main(String[] args) {

        SimpleHeap heap = new SimpleHeap();
        int[] maxheap = { 5 , 7, 9 ,1 ,3 , 2, 14, 8, 6 };
        for(int i = maxheap.length/2; i >= 0; i--) {
            heap.maxheapify(maxheap, i);
        }
        for(int i = 0; i < maxheap.length; i++) {
            System.out.print(maxheap[i] + " ");
        }
        System.out.println();
        int[] minheap = { 5 , 7, 9 ,1 ,3 , 2, 14, 8, 6 };
        for(int i = minheap.length/2; i>=0; i--) {
            heap.minheapify(minheap, i);
        }
        for(int i = 0; i < minheap.length; i++) {
            System.out.print(minheap[i] + " ");
        }
    }

    private void minheapify(int[] arr, int i) {
        int smallest = i;
        int l = i*2+1;
        int r = i*2+2;

        if(l < arr.length && arr[l] < arr[i]) {
            smallest = l;
        }
        if(r < arr.length && arr[r] < arr[smallest]) {
            smallest = r;
        }
        if(smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minheapify(arr, smallest);
        }
    }

    private void maxheapify(int[] arr, int i) {
        int l = i*2+1;
        int r = i*2+2;
        int largest = i;
        if(l < arr.length && arr[l] > arr[i]) {
            largest = l;
        }
        if(r < arr.length && arr[r] > arr[largest]) {
            largest = r;
        }
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxheapify(arr, largest);
        }

    }

}

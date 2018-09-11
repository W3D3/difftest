public class Sorting {

    public Sorting(int[] arr) {
        this.arr = arr;
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    /*Function to sort array using insertion sort*/
    void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void doSomething(boolean verbose) {
        Sorting.bubbleSort(this.arr);

        if (verbose) System.out.println("Array printed in reverse:");
        for (int i = this.arr.length - 1; i > 0; i--) {
            System.out.println(this.arr[i]);
        }
    }

    private void loopReverse() {
        //TODO implement
    }
}

package algo.quicksort;
public class QuickSortApp{

    public static void main(String[] args) {
        int[] inputArray = {6, 1, 7, 8, 2, 5};
        quickSort(inputArray, 0, inputArray.length-1);

        printArray(inputArray);
    }


    public static void printArray(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print("[ " + A[i] + " ]");
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int partitionPoint = partition(array, start, end); // returns the index position of the correctly placed pivot value in the array
            quickSort(array, start, partitionPoint-1); // sorts the left half of the range
            quickSort(array, partitionPoint+1, end); // sorts the right half the range
        }
    }

    public static int partition(int[] array, int start, int end) {
        int i = start-1; // in the first iteration, i starts from -1
        int pivot = array[end];
        for(int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, end);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
package algo.selectionsort;

public class SelectionSortApp {

    public static void main(String[] args) {
        int[] sortedArray = SelectionSortApp.selectionSort(new int[] {3,7,1,2,18,19,1,0});
        for (int number: sortedArray) {
            System.out.print("[ " + number + " ]");
        }
    }

    /*
    * Procedure SELECTION-SORT(A):
    * Inputs: A - an a to be sorted
    * Output: A sored in ascending order
    * 1. for i = 0 to A.length - 1:
    *       A. Set minimum to i
    *       B. for j = i + 1 to A.length:
    *           a. if A[j] < A[minimum]
    *               i. then set minimum to j
    *       C. swap A[i] with A[minimum]
    * Worse Case: O(n^2)
    * */
    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) { // Compare the current min with the rest of the values to find the next min value index
                if (a[j] < a[min]) { // if we find a smaller value
                    min = j; // then assign the new min
                }
            }
            swap(a, i, min);
        }
        return a;
    }

    public static void swap(int[] array, int i, int min) {
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }


}

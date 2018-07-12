package algo.insertionsort;

public class InsertionSortApp {

    public static void main(String[] args) {
        int[] a = new int[] {25, 47, 3, 19, 8, 18};
        InsertionSortApp.insertionSort(a);
        for (int number: a) {
            System.out.print("[ " + number + " ]");
        }
    }

    /**
     * Inputs: A - an array to be sored
     * Output: A sorted in ascending order
     * 1. for i = 1 to A.length - 1:
     *      A. Set element to A[i], and set j to i-1
     *      B. While j >= 0 and A[j] > element:
     *          a. Set A[j+1] to A[j]
     *          b. Decrement j by 1
     *      C. Set A[j+1] to element
     */
    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) { // i = 1, starting position in the unsorted region
            int element = a[i]; // Element variable contains the data we intend on bringing over to the sorted area
            int j = i - 1; // j variable points to the index position of the last value in the sorted area
            while (j >= 0 && a[j] > element) {
                a[j+1] = a[j]; // move the greater number to the right
                j--; // if j=-1, loop breaks
            }
            a[j+1] = element;
        }
        return a;
    }
}

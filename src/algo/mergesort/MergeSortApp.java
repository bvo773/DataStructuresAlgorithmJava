package algo.mergesort;

import java.util.Arrays;

public class MergeSortApp {
// Two major steps in mergeSort
// 1. "Splitting" the array into left and right subarrays mergeSort(), invoking itself until it hits the base(1 slot)
// 2. "Sorting" takes during merge(). Before merging(), both arrays MUST BE SORTED. If they are not sorted, we can't call merge;
/*  mergeSort(A, p, r) {               Range: p = left index  q = middle index r = right index
        if (p < r) {
            q = [(p+r)/2]
            mergeSort(A,p,q)
            mergeSort(A, q + 1, r)
            merge(A, p, q, r)
    }
*/
/* merge(A, p, q, r)    Range: p = left index  q = middle index r = right index */

    public static void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length-1);
    }

    public static void sort(int[] inputArray, int start, int end) {
        if (end <= start) {
            return; // we're done traversing the array
        }
        int mid = (start + end)/2;
        sort(inputArray, start, mid); // sort left half
        sort(inputArray, mid+1, end); // sort right half
        merge(inputArray, start, mid, end); // merge sorted results into the inputArray

    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        int[] resultArray = new int[end-start+1]; // Store the results
        int[] leftArray = new int[mid-start+2];
        int[] rightArray = new int[end-mid+1];

        int leftStart = start;
        int rightStart = mid+1;

        // Store values into left and right arrays to be compared in order to merge
        for(int i = 0; i < leftArray.length-1; i++) {
            leftArray[i] = inputArray[leftStart]; leftStart++;
        }
        leftArray[leftArray.length-1] = Integer.MAX_VALUE;

        for(int i = 0; i < rightArray.length-1; i++) {
            rightArray[i] = inputArray[rightStart]; rightStart++;
        }
        rightArray[rightArray.length-1] = Integer.MAX_VALUE;

        // Compare the two array values

        int i = 0; int j=0;
        int leftValue, rightValue;

        for (int resultI = 0; resultI < resultArray.length; resultI++) {
            leftValue = leftArray[i]; rightValue = rightArray[j];
            if (leftValue < rightValue) {
                resultArray[resultI] = leftValue;
                i++;
                continue;
            }
            resultArray[resultI] = rightValue;
            j++;
        }

        for (int index = 0; index < resultArray.length; index++) {
            inputArray[start] = resultArray[index];
            start++;
        }

    }

    public static void printArray(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print("[ " + A[i] + " ]");
        }
    }



    public static void main(String[] args) {
        int[] A = new int[] {2, 1, 3,4,2,5,7,23,12,11, 10};

        MergeSortApp.sort(A);
        MergeSortApp.printArray(A);
        //printArray(A);
    }
}

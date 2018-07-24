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
/* merge(A, p, q, r)    Range: p = left index  q = middle index r = right index

 */
//
//
    public static void mergeSort(int[] A, int p, int r) {

        if (p < r) {
            int q = (p+r)/2;
            mergeSort(A, p, q);
            mergeSort(A, q+1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {

    }

    public static void printArray(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print("[ " + A[i] + " ]");
        }
    }



    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 7, 3, 5, 9};

        MergeSortApp.mergeSort(A, 0, 5);
        printArray(A);
    }
}

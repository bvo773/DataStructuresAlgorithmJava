package algo.mergesort;

public class MergeSortApp {
// Two major steps in mergeSort
// 1. "Splitting" the array into left and right subarrays mergeSort(), invoking itself until it hits the base(1 slot)
// 2. "Sorting" takes during merge(). Before merging(), both arrays MUST BE SORTED. If they are not sorted, we can't call merge;
/*  mergeSort(A, p, r) {                p = left index  q = middle index r = right index
        if (p < r) {
            q = [(p+r)/2]
            mergeSort(A,p,q)
            mergeSort(A, q + 1, r)
            merge(A, p, q, r)
    }
*/
//
//
    public static void sort(int i, int n) {
        if (i < n) {
            System.out.println("Hello");
            sort(i+1, n);
            printWorld();

        }

    }

    public static void printWorld() {
        System.out.println(" World");
    }



    public static void main(String[] args) {
        MergeSortApp.sort(1,3);
    }
}

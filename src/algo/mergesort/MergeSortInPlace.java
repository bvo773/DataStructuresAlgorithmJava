package algo.mergesort;

public class MergeSortInPlace {
    private static int[] tempArray;

    public MergeSortInPlace(int[] inputArray) {
        tempArray = new int[inputArray.length];
    }


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
        mergeInPlace(inputArray, start, mid, end); // merge sorted results into the inputArray
    }

    public static void mergeInPlace(int[] inputArray, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;

        for(int k = 0; k <= end; k++) {
            tempArray[k] = inputArray[k]; // Store the current compare values into the temp array
        }

        for (int k = start; k <= end; k++) {
            if (i > mid) {
                inputArray[k] = tempArray[j];
                j++;
            } else if (j > end) {
                inputArray[k] = tempArray[i];
                i++;
            } else if (tempArray[j] < tempArray[i]) {
                inputArray[k] = tempArray[j];
                j++;
            } else {
                inputArray[k] = tempArray[i];
                i++;
            }
        }
    }

    public static void printArray() {
        for(int i = 0; i < tempArray.length; i++) {
            System.out.print("[ " + tempArray[i] + " ]");
        }
    }

    public static void main(String[] args) {
        int[] A = new int[] {2, 1, 3, 4, 7};

        MergeSortInPlace ms = new MergeSortInPlace(A);
        ms.sort(A);
        ms.printArray();
    }
}

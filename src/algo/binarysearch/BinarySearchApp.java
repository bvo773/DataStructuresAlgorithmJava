package algo.binarysearch;

public class BinarySearchApp {
    public static int binarySearch(int x, int[] arr) {
        int p = 0; // First(Left) index position of the range
        int r = arr.length-1; // Last(Right) index position of the range
        int iteration = 1;

        while (p <= r) {
            int q = (p + r)/2; // Midpoint index position of the range
            if (arr[q] == x) {
                System.out.println("Took " + iteration + " iterations");
                return q;
            }
            else if (arr[q] > x) // if the number is greater than the number we are searching for, move r's range to the left
                r = q - 1;
            else
                p = q + 1;
            iteration++;
        }
        return -1;
    }

    public static int binhBinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) { return mid;}
            else if (array[mid] > target) { right = mid - 1; }
            else if (array[mid] < target) { left = mid + 1; }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] arr = new int[] {3, 11, 21, 29, 41, 54, 61, 78, 110, 127};
        //System.out.println(binarySearch(78, arr));
        int[] arr = new int[] {1,2,3,4,5};
        int target = 5;
        System.out.println(binhBinarySearch(arr, target));
    }
}

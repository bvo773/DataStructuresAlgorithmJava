package algo.linearsearch;

public class LinearApp {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(LinearApp.linearSearch(new int[] {12,3,4}, 3));
    }
}

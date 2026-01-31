package sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];     
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }
    public static void main(String[] args) {
        int[] id = {1, 3, 4, 5, 2, 8, 18, 13, 9};
        insertionSort(id);
        System.out.println(Arrays.toString(id));
    }
}

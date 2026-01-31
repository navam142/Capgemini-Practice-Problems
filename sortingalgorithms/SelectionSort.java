package sortingalgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] scores = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(scores);
        System.out.println(Arrays.toString(scores));
    }
}

package sortingalgorithms;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid + 1, x = 0;
        int[] merged = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                merged[x++] = arr[i++];
            } else {
                merged[x++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[x++] = arr[i++];
        }

        while (j <= end) {
            merged[x++] = arr[j++];
        }

        for (int k = 0; k < merged.length; k++) {
            arr[start + k] = merged[k];
        }

    }

    static void split(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        split(arr, start, mid);
        split(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] prices = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        split(prices, 0, prices.length - 1);
        System.out.println(Arrays.toString(prices));
    }
}

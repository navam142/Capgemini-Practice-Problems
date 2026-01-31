package sortingalgorithms;

import java.util.Arrays;

public class HeapSort {

    public static void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            
            int temp = arr[0];
            arr[i] = temp;

        
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int arr[], int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }


    public static void main(String[] args) {
        int[] salaries = {25000, 40000, 10000, 12000, 11000, 99999999, 100000};
        sort(salaries);
        System.out.println(Arrays.toString(salaries));
    }
}

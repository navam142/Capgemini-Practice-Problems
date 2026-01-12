package Questions;

public class _5_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int firstLargest = -1, secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == -1) {
            System.out.println("No second largest element found");
        }
        System.out.println("second largest: " + secondLargest);
    }
}

package Questions;

public class _22_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int size = arr.length + 1;
        int sum = 0;
        for (int i = 1; i <= size; i++) {
            sum += i;
        }
        int currSum = 0;
        for (int i : arr) {
            currSum += i;
        }
        int missing = sum - currSum;
        System.out.println("missing number: " +missing);
    }
}

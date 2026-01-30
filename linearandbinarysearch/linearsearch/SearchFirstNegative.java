package linearandbinarysearch.linearsearch;

public class SearchFirstNegative {

    static int getFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, -1, 3, 9, 23, 92};
        System.out.println(getFirstNegative(arr));
    }
}

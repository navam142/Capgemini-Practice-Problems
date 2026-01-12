package Questions;

public class _7_PangramCheck {

    static boolean check(String s) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        for (int i : arr) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sample = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println("is Pangram? " + check(sample));
    }
}

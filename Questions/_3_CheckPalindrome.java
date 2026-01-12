package Questions;

public class _3_CheckPalindrome {

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String sample = "Navam";
        System.out.println(isPalindrome(sample));
    }
}

package Methods.Level1;

import java.util.Scanner;

public class _2_SubstringComparison {

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int start = sc.nextInt();

        int end = sc.nextInt();

        String subCharAt = createSubstringUsingCharAt(text, start, end);

        String subBuiltIn = text.substring(start, end);

        boolean isSame = compareStringsUsingCharAt(subCharAt, subBuiltIn);

        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + isSame);

        sc.close();
    }
}

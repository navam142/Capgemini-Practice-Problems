package Methods.Level1;

import java.util.Scanner;

public class _9_ConvertToUpperCaseAndCompare {

    static String convert(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                sb.append(ch);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    static boolean compare(String s1, String s2) {

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
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        s1 = convert(s1);
        System.out.println("Are Strings equal? " + compare(s1, s2));
    }
}

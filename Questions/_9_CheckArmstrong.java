package Questions;

import java.util.Scanner;

public class _9_CheckArmstrong {

    static boolean check(int n) {
        int totalDigits = Integer.toString(n).length();
        int originalNumber = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, totalDigits);
            n /= 10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("is Armstring? " + check(n));
    }
}

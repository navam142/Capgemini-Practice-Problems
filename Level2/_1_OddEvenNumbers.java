package Level2;

import java.util.Scanner;

public class _1_OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        sc.close();
    }

}
